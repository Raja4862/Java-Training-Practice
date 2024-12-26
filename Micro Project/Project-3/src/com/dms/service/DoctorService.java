package com.dms.service;

import com.dms.model.Doctor;

/**
 * The DoctorService interface defines the contract for the business logic layer
 * of the Doctor Management System (DMS). It provides validation and operation
 * methods for performing CRUD (Create, Read, Update, Delete) operations on
 * Doctor entities.
 * 
 * Implementations of this interface should contain the logic for validating
 * input, processing requests, and interacting with the data persistence layer
 * (such as repositories or DAOs) to perform the actual database operations.
 * 
 * This interface serves as an abstraction layer between the controller/view and
 * the data access layer, ensuring the application logic is separated from the
 * data management logic.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public interface DoctorService {

	public String insertDoctorValidation(Doctor doctor);

	public String deleteDoctorValidation(int id);

	public String updateDoctorValidation(Doctor doctor);

	public String findDoctorValidation(int id);

	public String findAllDoctorValidation();

}
