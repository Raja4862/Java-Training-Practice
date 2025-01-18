package com.tcbs.repo;

import com.tcbs.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
	// Custom query method to find a customer by name
	Customer findByCusName(String cusName);
}
