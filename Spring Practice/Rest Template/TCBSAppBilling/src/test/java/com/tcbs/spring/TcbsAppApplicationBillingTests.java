package com.tcbs.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TcbsAppApplicationBillingTests {

	@Test
	void contextLoads() {

	}

//	@Test
//	void testGetCustomer() {
//		// Create a RestTemplate instance
//		RestTemplate restTemplate = new RestTemplate();
//
//		// Send GET request to fetch Customer with ID 1
//		String url = "http://localhost:8094/customer/1";
//		ResponseEntity<Customer> response = restTemplate.getForEntity(url, Customer.class);
//
//		// Ensure the response is not null
//		assertNotNull(response);
//
//		// Ensure that the customer object is returned and contains the expected data
//		Customer customer = response.getBody();
//		assertNotNull(customer);
//		assertEquals("Siva", customer.getCusName()); // Assuming the customer name is "Siva"
//	}
//
//	@Test
//	void testCreateCustomer() {
//		// Create a RestTemplate instance
//		RestTemplate restTemplate = new RestTemplate();
//
//		// Set up customer data
//		Customer customer = new Customer();
//		customer.setCusName("Vspr");
//		customer.setCusContact("1234567890");
//		customer.setCusAddress("ed");
//
//		// Define the URL for adding a customer
//		String url = "http://localhost:8094/addCustomer";
//
//		// Send POST request to create the customer
//		ResponseEntity<Customer> response = restTemplate.postForEntity(url, customer, Customer.class);
//
//		// Ensure the response is not null
//		assertNotNull(response);
//
//		// Ensure the customer was created successfully
//		assertEquals(201, response.getStatusCodeValue()); // Check for HTTP 201 Created
//
//		// Ensure the customer returned in the response has the expected name
//		Customer createdCustomer = response.getBody();
//		assertNotNull(createdCustomer);
//		assertEquals("Vspr", createdCustomer.getCusName());
//	}

}
