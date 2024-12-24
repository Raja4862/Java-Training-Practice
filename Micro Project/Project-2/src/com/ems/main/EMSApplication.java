package com.ems.main;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.DepartmentService;
import com.ems.service.EmployeeService;
import com.ems.view.EmployeeView;
import com.ems.view.DepartementView;

/**
 * @author Praveen_Raja_S
 * @version 1.0 Employee Management System (EMS) It stores details such as the
 *          employee's ID, name, and salary.
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
		System.out.println("6. Insert Employee");
		System.out.println("7. Delete Employee");
		System.out.println("8. Update Employee");
		System.out.println("9. Find Employee");
		System.out.println("10. Find all Employee");
		System.out.println("11. Exit");

		System.out.println("Enter Your Choice = ");
		int choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		DepartmentService departmentservice = new DepartmentService();
		Employee employee;
		Department department;

		String msg = "";
		String result = "";
		int id;

		do {

			int choice = menu();

			switch (choice) {
			case 1:
				employee = EmployeeView.insertEmployeeView();
				result = employeeService.insertEmployeeValidation(employee);
				System.out.println(result);

				break;

			case 2:
				id = EmployeeView.deleteEmployeeView();
				result = employeeService.deleteEmployeeValidation(id);
				System.out.println(result);
				break;

			case 3:
				employee = EmployeeView.updateEmployeeView();
				result = employeeService.updateEmployeeValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = EmployeeView.findEmployeeView();
				result = employeeService.findEmployeeValidation(id);
				System.out.println(result);
				break;

			case 5:
				result = employeeService.findAllEmployeeValidation();
				System.out.println(result);
				break;
			case 6:
				department = DepartementView.insertDepartmentView();
				result = departmentservice.insertDepartmentValidation(department);
				System.out.println(result);

				break;

			case 7:
				id = DepartementView.deleteDepartmentView();
				result = departmentservice.deleteDepartmentValidation(id);
				System.out.println(result);
				break;

			case 8:
				department = DepartementView.updateDepartmentView();
				result = departmentservice.updateDepartmentValidation(department);
				System.out.println(result);
				break;
			case 9:
				id = DepartementView.findDepartmentView();
				result = departmentservice.findDepartmentValidation(id);
				System.out.println(result);
				break;

			case 10:
				result = departmentservice.findAllDepartmentValidation();
				System.out.println(result);
				break;

			case 11:
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
