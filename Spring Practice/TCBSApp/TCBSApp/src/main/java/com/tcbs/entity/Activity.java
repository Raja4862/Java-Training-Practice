package com.tcbs.entity;

import java.time.OffsetDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vspr_activity1")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long actId;

	@Column(name = "act_quantity", nullable = false)
	private int actQuantity;

	@Column(name = "act_timestamp", nullable = false)
	private OffsetDateTime actTimestamp;

	// Many-to-One relationship with Customer
	@ManyToOne
	@JoinColumn(name = "cus_id", nullable = false)
	private Customer customer;

	// Many-to-One relationship with Tariff
	@ManyToOne
	@JoinColumn(name = "act_Type", nullable = false)
	private Tariff tariff;

	public Activity() {
	}

	public Activity(int actQuantity, OffsetDateTime actTimestamp, Customer customer, Tariff tariff) {
		super();
		this.actQuantity = actQuantity;
		this.actTimestamp = actTimestamp;
		this.customer = customer;
		this.tariff = tariff;
	}

	// Getters and Setters
	public Long getActId() {
		return actId;
	}

	public void setActId(Long actId) {
		this.actId = actId;
	}

	public int getActQuantity() {
		return actQuantity;
	}

	public void setActQuantity(int actQuantity) {
		this.actQuantity = actQuantity;
	}

	public OffsetDateTime getActTimestamp() {
		return actTimestamp;
	}

	public void setActTimestamp(OffsetDateTime actTimestamp) {
		this.actTimestamp = actTimestamp;
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

	@Override
	public String toString() {
		return "Activity [actId=" + actId + ", actQuantity=" + actQuantity + ", actTimestamp=" + actTimestamp
				+ ", customer=" + customer + ", tariff=" + tariff + "]";
	}

}
