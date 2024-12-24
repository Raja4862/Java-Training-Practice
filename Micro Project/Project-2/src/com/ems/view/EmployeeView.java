package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class EmployeeView {

	static Scanner sc = new Scanner(System.in);
	static int empid, empsalary, dno;
	static String empname, dname;

	public static Employee insertEmployeeView() {

		System.out.println("Enter Employee id, Name and Salary,Department-no");

		empid = sc.nextInt();
		empname = sc.next();
		empsalary = sc.nextInt();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Employee(empid, empname, empsalary, department);

	}

	public static int deleteEmployeeView() {

		System.out.println("Enter Employee id = ");

		return sc.nextInt();

	}

	public static Employee updateEmployeeView() {

		System.out.println("for Update Enter new  Employee id, Name and Salary");

		empid = sc.nextInt();
		empname = sc.next();
		empsalary = sc.nextInt();
		dno = sc.nextInt();

		Department department = new Department();
		department.setDno(dno);

		return new Employee(empid, empname, empsalary, department);

	}

	public static int findEmployeeView() {
		System.out.println("Enter Employee id = ");
		return sc.nextInt();

	}

}
