package com.tcbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcbs.entity.Bill;

public interface BillRepo extends JpaRepository<Bill, Integer> {

	Bill findByCusId(int cusId);

}
