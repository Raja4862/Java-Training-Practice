package com.dms.view;

import java.util.Scanner;

import com.dms.model.Doctor;
import com.dms.model.Specialty;

/**
 * The DoctorView class provides methods for interacting with the user to
 * perform various operations related to doctors in the Doctor Management System
 * (DMS). This includes inserting, deleting, updating, and finding doctor
 * records. It also allows for interacting with specialty records.
 * 
 * The methods in this class map user input to the corresponding service layer
 * actions and present results to the user through the console.
 * 
 * The DoctorView class serves as the view layer in a typical MVC architecture
 * and is responsible for rendering data and receiving user commands related to
 * doctor and specialty management.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class DoctorView {

	static Scanner sc = new Scanner(System.in);
	static int docId, docContact, specId;
	static String docName;

	public static int printMenu() {
		System.out.println("1. Insert Doctor");
		System.out.println("2. Delete Doctor");
		System.out.println("3. Update Doctor");
		System.out.println("4. Find Doctor");
		System.out.println("5. Find all Doctor");
		System.out.println("6. Insert Specialty");
		System.out.println("7. Delete Specialty");
		System.out.println("8. Update Specialty");
		System.out.println("9. Find Specialty");
		System.out.println("10. Find all Specialty");
		System.out.println("11. Exit");
		System.out.println("Enter Your Choice = ");

		int choice = sc.nextInt();

		return choice;
	}

	public static void printResult(String result) {
		System.out.println(result);
	}

	public static void printInvalidChoice() {
		System.out.println("Invalid Choice");
	}

	public static String askToContinue() {
		System.out.println("Do you want to Continue (Yes / No ) = ");
		return sc.next();
	}

	public static Doctor insertDoctorView() {

		System.out.println("Enter Doctor ID, Name, Contact , SpecId");

		docId = sc.nextInt();
		docName = sc.next();
		docContact = sc.nextInt();
		specId = sc.nextInt();

		Specialty specialty = new Specialty();
		specialty.setSpecId(specId);

		return new Doctor(docId, docName, docContact, specialty);

	}

	public static int deleteDoctorView() {

		System.out.println("Please Enter Doctor id for (delete) = ");

		return sc.nextInt();

	}

	public static Doctor updateDoctorView() {

		System.out.println("For Update enter exists Id and New Name, Contact, SpecId ");

		docId = sc.nextInt();
		docName = sc.next();
		docContact = sc.nextInt();
		specId = sc.nextInt();

		Specialty specialty = new Specialty();
		specialty.setSpecId(specId);

		return new Doctor(docId, docName, docContact, specialty);

	}

	public static int findDoctorView() {
		System.out.println("Enter Doctor id = ");
		return sc.nextInt();

	}

}
