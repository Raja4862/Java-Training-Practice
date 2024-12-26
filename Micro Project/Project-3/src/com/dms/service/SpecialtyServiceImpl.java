package com.dms.service;

import com.dms.model.Specialty;
import com.dms.repo.SpecialtyRepo;
import com.dms.repo.SpecialtyRepoImpl;

/**
 * The SpecialtyServiceImpl class implements the SpecialtyService interface and
 * provides the business logic for managing Specialty entities in the Doctor
 * Management System (DMS). It performs various operations like inserting,
 * deleting, updating, and retrieving Specialty records.
 * 
 * This class interacts with the SpecialtyRepo layer to persist and retrieve
 * Specialty data from the database. It also includes validation logic to ensure
 * the integrity of the data before performing any database operations.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class SpecialtyServiceImpl implements SpecialtyService {

	SpecialtyRepo specialtyrepo = new SpecialtyRepoImpl();

	public String insertSpecialtyValidation(Specialty specialty) {
		String result;
		if (specialty == null) {
			result = "Specialty Object is null";
		} else if (specialty.getSpecId() == 0 || specialty.getSpecName() == null
				|| specialty.getSpecDescription() == null) {
			result = "Invalid Specialty Data";
		} else {

			boolean flag = specialtyrepo.doInsertSpecialty(specialty);

			if (flag) {
				return "Specialty Object Saved";
			} else {
				return "Specialty Object Not Saved";
			}
		}
		return result;

	}

	public String deleteSpecialtyValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid no";
		} else {
			boolean flag = specialtyrepo.doDeleteSpecialty(id);
			if (flag) {
				result = "Specialty Object Deleted";
			} else {
				result = "Specialty Object Not Found";
			}
		}
		return result;
	}

	public String updateSpecialtyValidation(Specialty specialty) {
		String result = "";
		if (specialty == null) {
			result = "Specialty Object is null";
		} else if (specialty.getSpecId() == 0 || specialty.getSpecName() == null
				|| specialty.getSpecDescription() == null) {
			result = "Invalid Specialty Data";
		} else {

			boolean flag = specialtyrepo.doUpdateSpecialty(specialty);

			if (flag) {
				result = "Specialty Object Updated";
			} else {
				result = "Specialty Object Not Found";
			}
		}
		return result;

	}

	public String findSpecialtyValidation(int id) {
		String result = "";
		Specialty specialty;
		if (id == 0) {
			result = "Invalid Id";
		} else {
			specialty = specialtyrepo.doFindSpecialty(id);
			if (specialty != null) {
				result = specialty.toString();
			} else {
				result = "Specialty Object Not Found";
			}
		}
		return result;
	}

	public String findAllSpecialtyValidation() {
		return specialtyrepo.doFindAllSpecialty().toString();
	}

}