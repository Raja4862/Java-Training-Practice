package com.tcbs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vspr_emp")
public class Customer {

	@Id
	@GeneratedValue
	private int cusId;

	@Column(name = "cusName")
	private String cusName;

	@Column(name = "cusContact", nullable = false, length = 20)
	private long cusContact;

	@Column(name = "cusAdress")
	private String cusAddress;

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

	public long getCusContact() {
		return cusContact;
	}

	public void setCusContact(long cusContact) {
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
