package com.tcbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcbs.entity.Bill;

public interface BillRepo extends JpaRepository<Bill, Integer> {
	// Find a bill by customer ID (assuming customer ID is unique)
	Bill findByCustomer_CusId(int cusId);
}
