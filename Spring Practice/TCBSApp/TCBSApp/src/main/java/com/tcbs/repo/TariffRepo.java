package com.tcbs.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcbs.entity.Tariff;

@Repository
public interface TariffRepo extends JpaRepository<Tariff, String> {

	Optional<Tariff> findByactType(String actType);

	Optional<Tariff> deleteByactType(String actType);

}
