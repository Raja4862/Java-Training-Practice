package com.tcbs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tcbs.entity.Customer;
import com.tcbs.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;

	// End-point for adding a single customer
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println("Received request to add customer: " + customer.getCusName());
		return service.saveCustomer(customer);
	}

	// End-point for adding multiple customers
	@PostMapping("/addCustomers")
	public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
		return service.saveCustomers(customers);
	}

	// End-point for getting all customers
	@GetMapping("/")
	public List<Customer> findAllCustomers() {
		return service.getCustomers();
	}

	// End-point for getting a customer by their ID
	@GetMapping("/CustomerByEmpId/{cusid}")
	public Optional<Customer> findCustomerById(@PathVariable int cusid) {
		return service.getCustomerById(cusid);
	}

	// End-point for getting a customer by their name
	@GetMapping("/Customer/{cusName}")
	public Customer findCustomerByName(@PathVariable String cusName) {
		return service.getCustomerByName(cusName);
	}

	// End-point for updating a customer
	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}

	// End-point for deleting a customer by ID
	@DeleteMapping("/delete/{cusid}")
	public String deleteCustomer(@PathVariable int cusid) {
		return service.deleteCustomer(cusid);
	}
}
