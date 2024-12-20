package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepoOne;

/**
 * @author Praveen_Raja_S
 * @version 1.0 
 * It performing Validation of CRUD Operation
 */

public class EmployeeService {

	// EmployeeRepo employeeRepo = new EmployeeRepo();
	EmployeeRepoOne employeeRepo = new EmployeeRepoOne();

	/**
	 * 
	 * @param employee
	 * @return String 
	 * It performing InsertValidation
	 */

	public String insertValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		} else if (employee.getEmpId() == 0 || employee.getEmpName() == null || employee.getEmpSalary() == 0) {
			result = "Invalid Employee Data";
		} else {

			boolean flag = employeeRepo.doInsert(employee);

			if (flag) {
				return "Employee Object Saved";
			} else {
				return "Employee Object Not Saved";
			}
		}
		return result;

	}

	/**
	 * 
	 * @param id
	 * @return String 
	 * It is Performing DeleteValidation
	 */

	public String deleteValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDelete(id);
			if (flag) {
				result = "Employee Object Deleted";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param employee
	 * @return String 
	 * It performing UpdateValidation
	 */
	public String updateValidation(Employee employee) {
		String result = "";
		if (employee == null) {
			result = "Employee Object is null";
		} else if (employee.getEmpId() == 0 || employee.getEmpName() == null || employee.getEmpSalary() == 0) {
			result = "Invalid Employee Data";
		} else {

			boolean flag = employeeRepo.doUpdate(employee);

			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @param id
	 * @return String 
	 * It performing FindValidation
	 */

	public String findValidation(int id) {
		String result = "";
		Employee employee;
		if (id == 0) {
			result = "Invalid Id";
		} else {
			employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;
	}

	/**
	 * 
	 * @return String 
	 * It performing Validation for Displaying All Employee
	 */
	public String findAllValidation() {
		return employeeRepo.doFindAll().toString();
	}

}