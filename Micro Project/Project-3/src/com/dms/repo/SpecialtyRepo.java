package com.dms.repo;



import java.util.List;

/**
 * The SpecialtyRepo interface defines the contract for interacting with the data persistence layer
 * for Specialty entities in the Doctor Management System (DMS). This interface provides methods 
 * for performing CRUD (Create, Read, Update, Delete) operations on Specialty objects.
 * 
 * Implementations of this interface should handle the actual logic of interacting with the database 
 * or other data sources for managing Specialty records.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

import com.dms.model.Specialty;

public interface SpecialtyRepo {

	public boolean doInsertSpecialty(Specialty specialty);

	public boolean doDeleteSpecialty(int id);

	public boolean doUpdateSpecialty(Specialty specialty);

	public Specialty doFindSpecialty(int id);

	public List<Specialty> doFindAllSpecialty();
}
