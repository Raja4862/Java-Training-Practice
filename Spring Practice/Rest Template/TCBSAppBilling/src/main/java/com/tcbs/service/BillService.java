package com.tcbs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.tcbs.entity.Bill;
import com.tcbs.model.Activity; // Model to represent activities
import com.tcbs.model.Customer; // Model to represent the customer
import com.tcbs.model.Tariff; // Model for Tariffs
import com.tcbs.repo.BillRepo;

@Service
public class BillService {

	@Autowired
	private BillRepo billRepository; // Assuming you have a repository for Bill

	@Autowired
	private RestTemplate restTemplate; // To call tcbsapp's APIs

	private static final Logger logger = LoggerFactory.getLogger(BillService.class);

	// Method to calculate the bill
	public ResponseEntity<String> calculateCustomerBill(int customerId) {
		try {
			// Fetch customer data from tcbsapp
			Customer customer = restTemplate.getForObject("http://localhost:8094/CustomerByEmpId/" + customerId,
					Customer.class);

			if (customer == null) {
				logger.error("Customer with ID " + customerId + " not found.");
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer not found!");
			}

			// Fetch activities for the customer
			ResponseEntity<Activity[]> response = restTemplate.exchange("http://localhost:8094/customer/" + customerId,
					HttpMethod.GET, null, Activity[].class);

			if (response.getStatusCode() != HttpStatus.OK || response.getBody() == null
					|| response.getBody().length == 0) {
				logger.error("No activities found for customer with ID " + customerId);
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No activities found!");
			}

			Activity[] activities = response.getBody();

			// Initialize charges
			double smsCharge = 0.0;
			double dataCharge = 0.0;
			double voiceCharge = 0.0;

			// Loop through activities and calculate charges
			for (Activity activity : activities) {
				// Fetch tariff for the activity type from tcbsapp
				Tariff tariff = restTemplate.getForObject(
						"http://localhost:8094/TariffbyType/" + activity.getTariff().getActType(), Tariff.class);

				if (tariff == null) {
					logger.warn("No tariff found for activity type: " + activity.getTariff().getActType());
					continue; // Skip if no tariff is found for this activity type
				}

				// Calculate charges based on activity type and tariff rate
				switch (activity.getTariff().getActType()) {
				case "Sms":
					smsCharge += activity.getActQuantity() * tariff.getActRate();
					break;
				case "Data":
					dataCharge += activity.getActQuantity() * tariff.getActRate();
					break;
				case "Voice":
					voiceCharge += activity.getActQuantity() * tariff.getActRate();
					break;
				default:
					logger.warn("Unknown activity type: " + activity.getTariff().getActType());
					break;
				}
			}

			// Calculate total bill
			double totalCharge = smsCharge + dataCharge + voiceCharge;

			// Create Bill object
			Bill bill = new Bill();
			bill.setCusId(customer.getCusId());
			bill.setSmsCharge(smsCharge);
			bill.setDataCharge(dataCharge);
			bill.setVoiceCharge(voiceCharge);
			bill.setTotalCost(totalCharge);

			try {
				// Check if the bill already exists
				Bill existingBill = billRepository.findByCusId(bill.getCusId());

				if (existingBill != null) {
					// Bill exists, update it
					existingBill.setSmsCharge(bill.getSmsCharge());
					existingBill.setDataCharge(bill.getDataCharge());
					existingBill.setVoiceCharge(bill.getVoiceCharge());
					existingBill.setTotalCost(bill.getTotalCost());

					// Save updated bill
					billRepository.save(existingBill);
					logger.info("Bill updated for customer ID " + customerId);
					return ResponseEntity.ok("Bill updated successfully");
				} else {
					// Bill does not exist, insert new one
					billRepository.save(bill); // Insert the new bill
					logger.info("Bill saved for customer ID " + customerId);
					return ResponseEntity.ok("Bill saved successfully");
				}
			} catch (Exception e) {
				// Handle exceptions during bill saving
				logger.error("Error saving/updating bill: " + e.getMessage());
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error saving/updating bill: " + e.getMessage());
			}

		} catch (HttpClientErrorException | HttpServerErrorException e) {
			logger.error("HTTP error while fetching data: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("HTTP error while fetching data: " + e.getMessage());
		} catch (Exception e) {
			logger.error("Unexpected error: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Unexpected error: " + e.getMessage());
		}
	}

	// Calculate the bills for all customers

	@Async
	public CompletableFuture<?> calculateAllCustomerBills() {
		Customer[] customers = restTemplate.getForObject("http://localhost:8094/FindAllCus", Customer[].class);

		if (customers == null) {
			return CompletableFuture.completedFuture(null); // No customers found
		}

		List<CompletableFuture<Void>> futures = new ArrayList<>();

		for (Customer customer : customers) {
			CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
				int cusid = customer.getCusId();
				calculateCustomerBill(cusid);
			});
			futures.add(future);
		}

		// Wait for all the tasks to complete asynchronously
		return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
	}

	public ResponseEntity<Bill> findBillByCustomer(int customerId) {
		try {
			// Attempt to find the bill by customer ID from the repository
			Bill bill = billRepository.findByCusId(customerId);

			// Check if a bill exists for the given customer ID
			if (bill == null) {
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // No bill found for the customer
			}

			// Return the bill with HTTP 200 OK status
			return ResponseEntity.ok(bill);

		} catch (Exception e) {
			logger.error("Error fetching bill for customer ID " + customerId, e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null); // Error while fetching bill
		}
	}

}
