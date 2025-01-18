package com.tcbs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vspr_emp1")

public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusId;

	@Column(name = "cusName")
	private String cusName;

	@Column(name = "cusContact")
	private String cusContact;

	@Column(name = "cusAdress")
	private String cusAddress;

	// Getters and setters
	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusContact() {
		return cusContact;
	}

	public void setCusContact(String cusContact) {
		this.cusContact = cusContact;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusContact=" + cusContact + ", cusAddress="
				+ cusAddress + "]";
	}
}
