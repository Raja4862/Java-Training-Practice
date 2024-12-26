package com.dms.main;

import com.dms.model.Specialty;
import com.dms.model.Doctor;
import com.dms.service.SpecialtyServiceImpl;
import com.dms.service.DoctorService;
import com.dms.service.DoctorServiceImpl;
import com.dms.service.SpecialtyService;
import com.dms.view.DoctorView;
import com.dms.view.SpecialtyView;

/**
 * The DMSApplication class provides the main interface for interacting with the
 * Doctor Management System (DMS). It presents a menu-driven system for
 * performing various operations related to doctors and specialties, such as
 * adding, updating, deleting, and retrieving information.
 * 
 * This class coordinates between the view (UI), services (business logic), and
 * models (data objects) to provide a seam-less user experience for managing
 * doctor and specialty data.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class DMSApplication {

	public static void main(String[] args) {

		DoctorService doctorservice = new DoctorServiceImpl();
		SpecialtyService specialtyservice = new SpecialtyServiceImpl();
		Doctor doctor;
		Specialty specialty;

		String msg = "";
		String result = "";
		int id;

		do {

			int choice = DoctorView.printMenu();

			// Switch case for handling user choice.
			switch (choice) {
			case 1:
				// Insert new doctor.
				doctor = DoctorView.insertDoctorView();
				result = doctorservice.insertDoctorValidation(doctor);
				DoctorView.printResult(result);
				break;

			case 2:
				// Delete a doctor.
				id = DoctorView.deleteDoctorView();
				result = doctorservice.deleteDoctorValidation(id);
				DoctorView.printResult(result);
				break;

			case 3:
				// Update an existing doctor.
				doctor = DoctorView.updateDoctorView();
				result = doctorservice.updateDoctorValidation(doctor);
				DoctorView.printResult(result);
				break;
			case 4:
				// Find a doctor by ID.
				id = DoctorView.findDoctorView();
				result = doctorservice.findDoctorValidation(id);
				DoctorView.printResult(result);
				break;

			case 5:
				// Find all doctors.
				result = doctorservice.findAllDoctorValidation();
				DoctorView.printResult(result);
				break;

			case 6:
				// Insert new specialty.
				specialty = SpecialtyView.insertSpecialtyView();
				result = specialtyservice.insertSpecialtyValidation(specialty);
				SpecialtyView.printResult(result);
				break;

			case 7:
				// Delete a specialty.
				id = SpecialtyView.deleteSpecialtyView();
				result = specialtyservice.deleteSpecialtyValidation(id);
				SpecialtyView.printResult(result);
				break;

			case 8:
				// Update an existing specialty.
				specialty = SpecialtyView.updateSpecialtyView();
				result = specialtyservice.updateSpecialtyValidation(specialty);
				SpecialtyView.printResult(result);
				break;

			case 9:
				// Find a specialty by ID.
				id = SpecialtyView.findSpecialtyView();
				result = specialtyservice.findSpecialtyValidation(id);
				SpecialtyView.printResult(result);
				break;

			case 10:
				// Find all specialties.
				result = specialtyservice.findAllSpecialtyValidation();
				SpecialtyView.printResult(result);
				break;

			case 11:
				// Exit the application.
				System.exit(0);
				break;

			default:
				// Invalid choice, display error message.
				DoctorView.printInvalidChoice();
				break;
			}

			// Ask the user if they want to continue using the application.
			msg = DoctorView.askToContinue();
		} while (msg.equalsIgnoreCase("Yes")); // Continue if user chooses "Yes".

	}
}
