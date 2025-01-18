package com.tcbs.controller;

import com.tcbs.entity.Bill;
import com.tcbs.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
public class BillController {

	@Autowired
	private BillService billService;

	// End-point to calculate a bill for a single customer
	@PostMapping("/calculate/{cusId}")
	public ResponseEntity<String> calculateCustomerBill(@PathVariable("cusId") int customerId) {
		String result = billService.calculateCustomerBill(new Bill(), customerId);
		return ResponseEntity.ok(result);
	}

	// End-point to calculate bills for all customers (Asynchronous)
	@PostMapping("/calculateAll")
	public CompletableFuture<ResponseEntity<String>> calculateAllCustomerBills() {
		return billService.calculateAllCustomerBills().thenApply(result -> ResponseEntity.ok(result));
	}

	// End-point to fetch bill validation (check if bill exists for customer ID)
	@GetMapping("/validate/{cusId}")
	public ResponseEntity<String> findBillValidation(@PathVariable("cusId") int customerId) {
		String result = billService.findBillValidation(customerId);
		return ResponseEntity.ok(result);
	}

	// End-point to get a detailed bill for a customer by ID
	@GetMapping("/details/{cusId}")
	public ResponseEntity<String> detailedBillDisplay(@PathVariable("cusId") int customerId) {
		String result = billService.detailedBillDisplay(customerId);
		return ResponseEntity.ok(result);
	}
}
