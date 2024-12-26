package com.dms.service;

import com.dms.model.Doctor;
import com.dms.repo.DoctorRepo;
import com.dms.repo.DoctorRepoImpl;

/**
 * The DoctorServiceImpl class implements the DoctorService interface, providing
 * the business logic for managing Doctor entities in the Doctor Management
 * System (DMS). It handles the validation of doctor data and interacts with the
 * Doctor repository for performing CRUD (Create, Read, Update, Delete)
 * operations on Doctor records.
 * 
 * This class ensures that data related to Doctors is processed correctly before
 * it is persisted in the database. It serves as a bridge between the
 * controller/view layer and the data access layer (repository).
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class DoctorServiceImpl implements DoctorService {

	DoctorRepo doctorrepo = new DoctorRepoImpl();

	public String insertDoctorValidation(Doctor doctor) {
		String result;
		if (doctor == null) {
			result = "Doctor Object is null";
		} else if (doctor.getDocId() == 0 || doctor.getDocName() == null || doctor.getDocContact() == 0
				|| doctor.getSpeciality().getSpecId() == 0) {
			result = "Invalid Doctor Data";
		} else {

			boolean flag = doctorrepo.doDoctorInsert(doctor);

			if (flag) {
				return "Doctor Object Saved";
			} else {
				return "Doctor Object Not Saved";
			}
		}
		return result;

	}

	public String deleteDoctorValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = doctorrepo.doDeleteDoctor(id);
			if (flag) {
				result = "Doctor Object Deleted";
			} else {
				result = "Doctor Object Not Found";
			}
		}
		return result;
	}

	public String updateDoctorValidation(Doctor doctor) {
		String result = "";
		if (doctor == null) {
			result = "Doctor Object is null";
		} else if (doctor.getDocId() == 0 || doctor.getDocName() == null || doctor.getDocContact() == 0
				|| doctor.getSpeciality().getSpecId() == 0) {
			result = "Invalid Doctor Data";
		} else {

			boolean flag = doctorrepo.doUpdateDoctor(doctor);

			if (flag) {
				result = "Doctor Object Saved";
			} else {
				result = "Doctor Object Not Found";
			}
		}
		return result;

	}

	public String findDoctorValidation(int id) {
		String result = "";
		Doctor doctor;
		if (id == 0) {
			result = "Invalid Doctor Id";
		} else {
			doctor = doctorrepo.doFindDoctor(id);
			if (doctor != null) {
				result = doctor.toString();
			} else {
				result = "Doctor Object Not Found";
			}
		}
		return result;
	}

	public String findAllDoctorValidation() {
		return doctorrepo.doFindAllDoctor().toString();
	}

}