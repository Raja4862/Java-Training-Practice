package com.ems.model;

/**
 * @author Praveen_Raja_S
 * @version 1.0 Framework of Employee Data
 */

public class Employee {

	private int empId;
	private String empName;
	private int empSalary;
	private Department department; // HAS-A

	public Employee() {

	}

	public Employee(int empId, String empName, int empSalary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", department="
				+ department + "]";
	}

}
