package com.tcbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcbs.entity.Customer;
import com.tcbs.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;

	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}

	@PostMapping("/addCustomer")
	public List<Customer> addCustomer(@RequestBody List<Customer> customer) {
		return service.saveCustomer(customer);
	}

	@GetMapping("/Customer")
	public List<Customer> findAllEmployees() {
		return service.getCustomers();
	}

	@GetMapping("/CustomerByEmpId/{cusid}")
	public Customer findEmployeeByEmpId(@PathVariable int cusId) {
		return service.getCustomerById(cusId);
	}

	@GetMapping("/Customer/{cusName}")
	public Customer findCustomerByName(@PathVariable String cusName) {
		return service.getCustomerByName(cusName);
	}

	@PutMapping("/update")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return service.updateCustomer(customer);
	}

	@DeleteMapping("/delete/{cusid}")
	public String deleteCustomer(@PathVariable int cusId) {
		return service.deleteCustomer(cusId);
	}
}