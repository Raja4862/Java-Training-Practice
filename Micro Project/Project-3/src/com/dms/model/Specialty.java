package com.dms.model;

/**
 * The Specialty class represents a medical specialty in the Doctor Management
 * System (DMS). It contains details about the specialty, such as its ID, name,
 * and description.
 * 
 * This class provides getter and setter methods to access and modify the
 * attributes of a specialty, and includes a `toString()` method to return a
 * string representation of the specialty.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class Specialty {

	private int specId;
	private String specName;
	private String specDescription;

	public Specialty() {

	}

	public Specialty(int specId, String specName, String specDescription) {
		super();
		this.specId = specId;
		this.specName = specName;
		this.specDescription = specDescription;
	}

	public int getSpecId() {
		return specId;
	}

	public void setSpecId(int specId) {
		this.specId = specId;
	}

	public String getSpecName() {
		return specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
	}

	public String getSpecDescription() {
		return specDescription;
	}

	public void setSpecDescription(String specDescription) {
		this.specDescription = specDescription;
	}

	@Override
	public String toString() {
		return "Specialty [specId = " + specId + ", specName = " + specName + ", specDescription = " + specDescription
				+ "]";
	}

}
