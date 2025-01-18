package com.tcbs.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.tcbs.entity.Activity;
import com.tcbs.entity.Bill;
import com.tcbs.entity.Customer;
import com.tcbs.entity.Tariff;
import com.tcbs.repo.BillRepo;

@Service
public class BillService {

	@Autowired
	private CustomerService customerService; // Changed from CustomerService to CustomerRepo

	@Autowired
	private TariffService tariffService; // Fixed typo (from traiffRepo to tariffRepo)

	@Autowired
	private ActivityService activityService;

	@Autowired
	private BillRepo billRepo;

	// Calculate the bill for a single customer
	public String calculateCustomerBill(Bill bill, int cusid) {
		// Fetch customer by ID
		Optional<Customer> customerOpt = customerService.getCustomerById(cusid);
		String result = "";

		if (customerOpt.isEmpty()) {
			return "Customer not found for ID: " + cusid;
		}

		Customer customer = customerOpt.get();
		bill.setCustomer(customer);
		// Fetch all activities for the customer
		List<Activity> activities = activityService.getActivitiesByCustomerId(cusid);
		if (activities.isEmpty()) {
			return "No activities found for customer with ID: " + cusid;
		}

		// Initialize charges for each activity type
		double smsCharge = 0.0;
		double dataCharge = 0.0;
		double voiceCharge = 0.0;

		// Loop through all activities and calculate charges
		for (Activity activity : activities) {
			String actType = activity.getTariff().getActType();
			double actValue = activity.getActQuantity();

			// Get tariff for the activity type
			Tariff tariff = tariffService.getTariffByName(actType);
			if (tariff == null) {
				continue; // Skip if no tariff is found for this activity type
			}
			bill.setTariff(tariff);

			// Calculate charges based on activity type
			switch (actType) {
			case "Sms":
				smsCharge += actValue * tariff.getActRate();
				break;
			case "Data":
				dataCharge += actValue * tariff.getActRate();
				break;
			case "Voice":
				voiceCharge += actValue * tariff.getActRate();
				break;
			default:
				break;
			}
		}

		double totalCharge = smsCharge + dataCharge + voiceCharge;

		// Set charges in the bill
		bill.setSmsCharge(smsCharge);
		bill.setDataCharge(dataCharge);
		bill.setVoiceCharge(voiceCharge);
		bill.setTotalCost(totalCharge);

		// Save or update the bill using save() method
		Bill savedBill = billRepo.save(bill); // This will insert or update the bill
		if (savedBill != null) {
			result = "Bill saved or updated successfully.";
		} else {
			result = "Failed to save or update bill.";
		}

		// Write the bill to a file
		writeBillToFile(customer, bill);

		return result;
	}

	// Write bill to a file
	private void writeBillToFile(Customer customer, Bill bill) {
		try {
			String filename = "D:\\customer_" + customer.getCusId() + "_bills.txt";
			FileWriter fileWriter = new FileWriter(filename);
			try (BufferedWriter writer = new BufferedWriter(fileWriter)) {
				writer.write(bill.toString()); // Assuming `toString()` provides a detailed representation
			}
		} catch (IOException e) {
			System.out.println("Error while writing to file: " + e.getMessage());
		}
	}

	// Calculate the bills for all customers
	@Async
	public CompletableFuture<String> calculateAllCustomerBills() {
		List<Customer> customers = customerService.getCustomers();

		if (customers == null || customers.isEmpty()) {
			return CompletableFuture.completedFuture("No customers found.");
		}

		for (Customer customer : customers) {
			Bill bill = new Bill();
			bill.setCustomer(customer);
			int cusid = customer.getCusId();

			String result = calculateCustomerBill(bill, cusid);

			// Log or handle result of each customer's bill calculation
			System.out.println(result); // Or use logger
		}

		return CompletableFuture.completedFuture("All customer bills are being processed.");
	}

	// Fetch Bill Validation
	public String findBillValidation(int id) {
		if (id == 0) {
			return "Invalid Customer Id";
		}

		Bill bill = billRepo.findByCustomer_CusId(id);
		if (bill != null) {
			return bill.toString();
		} else {
			return "Bill Object Not Found";
		}
	}

	// Detailed Bill Display
	public String detailedBillDisplay(int id) {
		Bill bill = billRepo.findByCustomer_CusId(id);
		if (bill != null) {
			return bill.toString(); // Returning the string representation of the bill
		} else {
			return "Bill not found for customer ID: " + id;
		}
	}
}
