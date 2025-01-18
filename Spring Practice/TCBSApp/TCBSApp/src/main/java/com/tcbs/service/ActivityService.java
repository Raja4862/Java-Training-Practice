package com.tcbs.service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcbs.entity.Activity;
import com.tcbs.entity.Customer;
import com.tcbs.entity.Tariff;
import com.tcbs.repo.ActivityRepo;
import com.tcbs.repo.TariffRepo;

@Service
public class ActivityService {

	@Autowired
	private ActivityRepo activityRepo;

	@Autowired
	private CustomerService customerService; // Assuming CustomerRepo exists

	@Autowired
	private TariffRepo tariffRepo; // Assuming TariffRepo exists

	// Method to save a single activity
	@Transactional
	public Activity saveActivity(int cusId, String actType, int actQuantity, OffsetDateTime actTimestamp) {
		// Check if the customer exists by cusId
		Optional<Customer> customerOpt = customerService.getCustomerById(cusId);

		// If the customer doesn't exist, return null or handle the failure
		if (!customerOpt.isPresent()) {
			return null; // Customer not found, return null (you can handle this better with exceptions)
		}

		// Fetch the tariff by actType
		Optional<Tariff> tariffOpt = tariffRepo.findByactType(actType);

		// If the tariff doesn't exist, return null or handle the failure
		if (!tariffOpt.isPresent()) {
			return null; // Tariff not found, return null (you can handle this better with exceptions)
		}

		// Create a new Activity and save it
		Customer customer = customerOpt.get();
		Tariff tariff = tariffOpt.get();
		Activity activity = new Activity(actQuantity, actTimestamp, customer, tariff);

		return activityRepo.save(activity);
	}

	// Method to get all activities
	public List<Activity> getAllActivities() {
		return activityRepo.findAll(); // This fetches all activities from the database
	}

	// Method to get activities by customer ID
	public List<Activity> getActivitiesByCustomerId(int cusId) {
		return activityRepo.findByCustomer_CusId(cusId);
	}

	// Method to get activities by tariff
	public List<Activity> getActivitiesByTariff(String actType) {
		return activityRepo.findByTariff_ActType(actType);
	}

	// Method to delete an activity by ID
	public String deleteActivity(Long id) {
		if (activityRepo.existsById(id)) {
			activityRepo.deleteById(id);
			return "Activity removed !! " + id;
		} else {
			return "Activity not found with ID " + id;
		}
	}

}
