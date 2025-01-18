package com.tcbs.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vspr_bill1") // Table name in your database
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long billId;

	// Many-to-one relationship with Customer (one customer can have many bills)
	@ManyToOne
	@JoinColumn(name = "cus_id") // Foreign key column referencing Customer
	private Customer customer;

	// Many-to-one relationship with Tariff (one tariff can be applied to many
	// bills)
	@ManyToOne
	@JoinColumn(name = "act_Type") // Foreign key column referencing Tariff
	private Tariff tariff;

	// Fields to store charges (assuming they are calculated)
	@Column(name = "smsCharge")
	private double smsCharge;

	@Column(name = "dataCharge")
	private double dataCharge;

	@Column(name = "voiceCharge")
	private double voiceCharge;

	@Column(name = "totalCost")
	private double totalCost;

	// Default constructor (required by JPA)
	public Bill() {
	}

	// Constructor without Activity (remove if not required)
	public Bill(Long billId, Customer customer, Tariff tariff, double smsCharge, double dataCharge, double voiceCharge,
			double totalCost) {
		this.billId = billId;
		this.customer = customer;
		this.tariff = tariff;
		this.smsCharge = smsCharge;
		this.dataCharge = dataCharge;
		this.voiceCharge = voiceCharge;
		this.totalCost = totalCost;
	}

	// Getters and Setters

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Tariff getTariff() {
		return tariff;
	}

	public void setTariff(Tariff tariff) {
		this.tariff = tariff;
	}

	public double getSmsCharge() {
		return smsCharge;
	}

	public void setSmsCharge(double smsCharge) {
		this.smsCharge = smsCharge;
	}

	public double getDataCharge() {
		return dataCharge;
	}

	public void setDataCharge(double dataCharge) {
		this.dataCharge = dataCharge;
	}

	public double getVoiceCharge() {
		return voiceCharge;
	}

	public void setVoiceCharge(double voiceCharge) {
		this.voiceCharge = voiceCharge;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", customer=" + customer + ", tariff=" + tariff + ", smsCharge=" + smsCharge
				+ ", dataCharge=" + dataCharge + ", voiceCharge=" + voiceCharge + ", totalCost=" + totalCost + "]";
	}
}
