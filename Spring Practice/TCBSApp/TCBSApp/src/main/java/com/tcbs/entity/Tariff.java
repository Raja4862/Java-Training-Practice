package com.tcbs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vspr_Tariff1")

public class Tariff {

	@Id
	@Column(name = "actType")
	private String actType;

	@Column(name = "actRate")
	private float actRate;

	public String getActType() {
		return actType;
	}

	public void setActType(String actType) {
		this.actType = actType;
	}

	public float getActRate() {
		return actRate;
	}

	public void setActRate(float actRate) {
		this.actRate = actRate;
	}

	@Override
	public String toString() {
		return "Tariff [actType=" + actType + ", actRate=" + actRate + "]";
	}

}
