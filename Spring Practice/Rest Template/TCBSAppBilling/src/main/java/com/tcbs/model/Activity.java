package com.tcbs.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Activity {

	private Long actId;

	private int actQuantity;

	private OffsetDateTime actTimestamp;

	private Customer customer;

	private Tariff tariff;



}
