package com.tcbs.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcbs.entity.Bill;
import com.tcbs.service.BillService;

@RestController
public class BillController {

	@Autowired
	private BillService billService;

// End-point to calculate a bill for a single customer
	@PostMapping("/calculate/{cusId}")
	public ResponseEntity<?> calculateCustomerBill(@PathVariable("cusId") int customerId) {
		ResponseEntity<String> result = billService.calculateCustomerBill(customerId);
		return ResponseEntity.ok(result);
	}

	@PostMapping("/calculateAll")
	public ResponseEntity<String> calculateAllCustomerBill() {
		try {
			// Call the asynchronous method and wait for the result
			CompletableFuture<?> resultFuture = billService.calculateAllCustomerBills();

			// Wait for the CompletableFuture to complete and get the result
			String result = (String) resultFuture.get(); // get() blocks until the result is ready

			// Return the result wrapped in ResponseEntity
			return ResponseEntity.ok(result);
		} catch (Exception e) {
			// Handle any errors (such as InterruptedException or ExecutionException)
			return ResponseEntity.status(500).body("An error occurred while calculating bills: " + e.getMessage());
		}
	}

	@GetMapping("/bill/{customerId}")
	public ResponseEntity<Bill> getBillByCustomer(@PathVariable int customerId) {
		return billService.findBillByCustomer(customerId);
	}

}
