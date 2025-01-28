package com.tcbs.model;

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

public class Customer {

	private int cusId;

	private String cusName;

	private String cusContact;

	private String cusAddress;

}
