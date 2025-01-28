package com.tcbs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter // Generates getters for all fields
@Setter // Generates setters for all fields
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates a constructor with all fields
@ToString // Generates a toString method
@Table(name = "vspr_bill1") // Table name in your database
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long billId;

	@Column(name = "cusId")
	private int cusId;

	// Fields to store charges (assuming they are calculated)
	@Column(name = "smsCharge")
	private double smsCharge;

	@Column(name = "dataCharge")
	private double dataCharge;

	@Column(name = "voiceCharge")
	private double voiceCharge;

	@Column(name = "totalCost")
	private double totalCost;

}
