package com.tcbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tcbs.entity.Tariff;
import com.tcbs.service.TariffService;

@RestController
public class TariffController {

	@Autowired
	private TariffService service;

	// End-point for adding a single customer
	@PostMapping("/addTariff")
	public Tariff addTariff(@RequestBody Tariff tariff) {
		return service.saveTariff(tariff);
	}

	// End-point for adding multiple customers
	@PostMapping("/addTariffs")
	public List<Tariff> addTariffs(@RequestBody List<Tariff> tariff) {
		return service.saveTariffs(tariff);
	}

	// End-point for getting all customers
	@GetMapping("/allTraiff")
	public List<Tariff> findAllTariffs() {
		return service.getTariff();
	}

	// End-point for getting a customer by their ID
	@GetMapping("/TariffbyType/{actType}")
	public Tariff findTariffByType(@PathVariable String actType) {
		return service.getTariffByName(actType);
	}

	// End-point for updating a customer
	@PutMapping("/updateTraiff")
	public Tariff updateCustomer(@RequestBody Tariff tariff) {
		return service.updateTariff(tariff);
	}

	// End-point for deleting a customer by ID
	@DeleteMapping("/delete/{actType}")
	public String deleteCustomer(@PathVariable String actType) {
		return service.deleteTariff(actType);
	}
}
