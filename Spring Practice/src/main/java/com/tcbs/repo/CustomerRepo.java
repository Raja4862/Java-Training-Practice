package com.tcbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcbs.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	Customer findByFirstName(String name);

}
