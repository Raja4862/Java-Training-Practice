package com.dms.service;

import com.dms.model.Specialty;

/**
 * The SpecialtyService interface defines the contract for managing Specialty
 * entities in the Doctor Management System (DMS). It provides methods for
 * performing CRUD operations (Create, Read, Update, Delete) on Specialty
 * records. The service methods include validation logic to ensure that data is
 * correct before performing the actual data operations using the repository
 * layer.
 * 
 * Implementations of this interface should handle the business logic for
 * managing Specialty records while interacting with the appropriate repository
 * classes.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public interface SpecialtyService {
	public String insertSpecialtyValidation(Specialty specialty);

	public String deleteSpecialtyValidation(int id);

	public String updateSpecialtyValidation(Specialty specialty);

	public String findSpecialtyValidation(int id);

	public String findAllSpecialtyValidation();

}
