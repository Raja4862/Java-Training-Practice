package com.tcbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcbs.entity.Customer;
import com.tcbs.repo.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo repository;

	public Customer saveCustomer(Customer customer) {
		return repository.save(customer);
	}

	public List<Customer> saveCustomer(List<Customer> customer) {
		return repository.saveAll(customer);
	}

	public List<Customer> getCustomers() {
		return repository.findAll();
	}

	public Customer getCustomerById(int cusId) {
		return repository.findById(cusId).orElse(null);
	}

	public Customer getCustomerByName(String name) {
		return repository.findByFirstName(name);
	}

	public String deleteCustomer(int id) {
		repository.deleteById(id);
		return "Customer removed !! " + id;
	}

	public Customer updateCustomer(Customer customer) {

		Customer existingCustomer = repository.findById(customer.getCusId()).orElse(null);

		existingCustomer.setCusName(customer.getCusName());
		existingCustomer.setCusContact(customer.getCusContact());
		existingCustomer.setCusAddress(customer.getCusAddress());
		return repository.save(existingCustomer);

	}
}
