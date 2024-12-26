package com.dms.repo;

import java.util.List;

/**
 * The DoctorRepo interface defines the contract for interacting with the data persistence layer
 * for Doctor entities in the Doctor Management System (DMS). It provides methods for performing
 * CRUD (Create, Read, Update, Delete) operations on Doctor objects.
 * 
 * Implementations of this interface will handle the actual logic of interacting with the database
 * or any other data source for storing and retrieving Doctor records.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

import com.dms.model.Doctor;

public interface DoctorRepo {
	public boolean doDoctorInsert(Doctor doctor);

	public boolean doDeleteDoctor(int id);

	public boolean doUpdateDoctor(Doctor doctor);

	public Doctor doFindDoctor(int id);

	public List<Doctor> doFindAllDoctor();
}
