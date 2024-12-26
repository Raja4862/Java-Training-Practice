package com.dms.model;

/**
 * The Doctor class represents a doctor in the Doctor Management System (DMS).
 * It contains details about the doctor, including their ID, name, contact
 * information, and specialty.
 * 
 * This class provides getter and setter methods to access and modify the
 * attributes of a doctor, and also includes a `toString()` method to print the
 * doctor’s details in a readable format.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class Doctor {

	private int docId;
	private String docName;
	private int docContact;
	private Specialty speciality;

	public Doctor() {
	}

	public Doctor(int docId, String empName, int empSalary, Specialty speciality) {
		super();
		this.docId = docId;
		this.docName = empName;
		this.docContact = empSalary;
		this.speciality = speciality;
	}

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String empName) {
		this.docName = empName;
	}

	public int getDocContact() {
		return docContact;
	}

	public void setDocContact(int empSalary) {
		this.docContact = empSalary;
	}

	public Specialty getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Specialty speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return "Doctor [docId = " + docId + ", docName = " + docName + ", docContact = " + docContact
				+ ", speciality = " + speciality.getSpecId() + "]";
	}

}
