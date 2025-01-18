package com.tcbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcbs.entity.Customer;
import com.tcbs.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo repository;

	// Method to save a single customer
	@Transactional
	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}

	// Method to save a list of customers
	@Transactional
	public List<Customer> saveCustomers(List<Customer> customers) {
		return repository.saveAll(customers);
	}

	// Method to get all customers
	public List<Customer> getCustomers() {
		return repository.findAll();
	}

	// Method to get a customer by ID
	public Optional<Customer> getCustomerById(int cusId) {
		return repository.findById(cusId);
	}

	// Method to get a customer by name
	public Customer getCustomerByName(String name) {
		return repository.findByCusName(name);
	}

	// Method to delete a customer by ID
	public String deleteCustomer(int id) {
		repository.deleteById(id);
		return "Customer removed !! " + id;
	}

	// Method to update customer information
	@Transactional
	public Customer updateCustomer(Customer customer) {
		Customer existingCustomer = repository.findById(customer.getCusId()).orElse(null);
		if (existingCustomer == null) {
			return null;
		}
		existingCustomer.setCusName(customer.getCusName());
		existingCustomer.setCusContact(customer.getCusContact());
		existingCustomer.setCusAddress(customer.getCusAddress());
		return repository.save(existingCustomer);
	}
}
