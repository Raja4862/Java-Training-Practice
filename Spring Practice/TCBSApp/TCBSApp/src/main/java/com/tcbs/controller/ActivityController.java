package com.tcbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcbs.entity.Activity;
import com.tcbs.service.ActivityService;

@RestController
public class ActivityController {

	@Autowired
	private ActivityService activityService;

	// End-point to create a new activity
	@PostMapping("/CreateActivity")
	public ResponseEntity<Activity> createActivity(@RequestBody Activity activityRequest) {

		try {
			Activity createdActivity = activityService.saveActivity(activityRequest.getCustomer().getCusId(),
					activityRequest.getTariff().getActType(), activityRequest.getActQuantity(),
					activityRequest.getActTimestamp());

			if (createdActivity == null) {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Customer or Tariff not found, creation failed
			}

			return new ResponseEntity<>(createdActivity, HttpStatus.CREATED); // Activity created successfully

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Invalid timestamp or other issues
		}
	}

	// End-point to get activities by customer ID
	@GetMapping("/customer/{cusId}")
	public ResponseEntity<List<Activity>> getActivitiesByCustomerId(@PathVariable int cusId) {
		List<Activity> activities = activityService.getActivitiesByCustomerId(cusId);

		if (activities.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); // No activities found for the customer
		}
		return new ResponseEntity<>(activities, HttpStatus.OK); // Activities found, return them with a 200 OK response
	}

	// End-point to delete an activity by ID
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteActivity(@PathVariable Long id) {
		String response = activityService.deleteActivity(id);

		if ("Activity removed !!".equals(response)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Success
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND); // If Activity not found
		}
	}

	// End-point to get all activities
	@GetMapping
	public ResponseEntity<List<Activity>> getAllActivities() {
		List<Activity> activities = activityService.getAllActivities();

		if (activities.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<>(activities, HttpStatus.OK);
	}
}
