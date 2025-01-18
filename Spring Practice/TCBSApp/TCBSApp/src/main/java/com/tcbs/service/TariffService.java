package com.tcbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcbs.entity.Tariff;
import com.tcbs.repo.TariffRepo;

@Service
public class TariffService {

	@Autowired
	private TariffRepo repository;

	// Method to save a single tariff
	@Transactional
	public Tariff saveTariff(Tariff tariff) {
		return repository.save(tariff);
	}

	// Method to save a list of tariffs
	@Transactional
	public List<Tariff> saveTariffs(List<Tariff> tariffs) {
		return repository.saveAll(tariffs);
	}

	// Method to get all tariffs
	public List<Tariff> getTariff() {
		return repository.findAll();
	}

	// Method to get a tariff by actType
	public Tariff getTariffByName(String actType) {
		return repository.findByactType(actType).orElse(null); // Use findByActType instead of deleteByactType
	}

	// Method to delete a tariff by actType
	public String deleteTariff(String actType) {
		repository.deleteByactType(actType);
		return "Tariff removed !! " + actType;
	}

	// Method to update tariff information
	@Transactional
	public Tariff updateTariff(Tariff tariff) {
		Tariff existingTariff = repository.deleteByactType(tariff.getActType()).orElse(null);
		if (existingTariff == null) {
			return null;
		}

		existingTariff.setActType(tariff.getActType());
		existingTariff.setActRate(tariff.getActRate());
		return repository.save(existingTariff);
	}
}
