package com.tcbs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcbs.entity.Activity;

public interface ActivityRepo extends JpaRepository<Activity, Long> {
	// Find activity by customer ID
	List<Activity> findByCustomer_CusId(int cusId);

	// Find activity by tariff ID (using actType)
	List<Activity> findByTariff_ActType(String actType);

	// Find activities by customer and tariff
	List<Activity> findByCustomer_CusIdAndTariff_ActType(Long cusId, String actType);

}