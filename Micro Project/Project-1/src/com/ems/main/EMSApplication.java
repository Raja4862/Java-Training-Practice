package com.ems.main;

import java.util.Scanner;
import com.ems.model.Employee;
import com.ems.service.EmployeeService;

/**
 * @author Praveen_Raja_S
 * @version 1.0
 * Employee Management System (EMS) 
 * It stores details such as the employee's ID, name, and salary.
 * 
 */

public class EMSApplication {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find all Employee");
		System.out.println("6. Exit");

		System.out.println("Enter Your Choice = ");
		int choice = sc.nextInt();

		return choice;
	}

	public static Employee insertView() {

		System.out.println("Enter Employee id, Name and Salary");

		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

	}

	public static int deleteView() {

		System.out.println("Enter Employee id = ");

		return sc.nextInt();

	}
	public static Employee updateView() {

		System.out.println("Enter Employee id, Name and Salary");

		return new Employee(sc.nextInt(), sc.next(), sc.nextDouble());

	}public static int findView() {

		System.out.println("Enter Employee id = ");

		return sc.nextInt();

	}

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		Employee employee;
		
		String msg = "";
		String result = "";
		int id;

		do {

			int choice = menu();

			switch (choice) {
			case 1:
				employee = insertView();
				result = employeeService.insertValidation(employee);
				System.out.println(result);

				break;
			case 2:
				id = deleteView();
				result = employeeService.deleteValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = updateView();
				result = employeeService.updateValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = findView();
				result = employeeService.findValidation(id);
				System.out.println(result);				
				break;
			case 5:
				result = employeeService.findAllValidation();
				System.out.println(result);	
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

			System.out.println("Do you want to Continue (Yes / No ) = ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
