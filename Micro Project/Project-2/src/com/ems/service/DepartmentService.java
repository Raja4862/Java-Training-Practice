package com.ems.service;

import com.ems.model.Department;
import com.ems.repo.DepartmentRepo;

/**
 * @author Praveen_Raja_S
 * @version 1.0 It performing Validation of CRUD Operation
 */

public class DepartmentService {

	DepartmentRepo departmentRepo = new DepartmentRepo();

	/**
	 * 
	 * @param employee
	 * @return String It performing InsertValidation
	 */

	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Employee Object is null";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid Employee Data";
		} else {

			boolean flag = departmentRepo.doInsertDepartment(department);

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
	 * @return String It is Performing DeleteValidation
	 */

	public String deleteDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid no";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);
			if (flag) {
				result = "Department Object Deleted";
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param employee
	 * @return String It performing UpdateValidation
	 */

	public String updateDepartmentValidation(Department department) {
		String result = "";
		if (department == null) {
			result = "Employee Object is null";
		} else if (department.getDno() == 0 || department.getDname() == null) {
			result = "Invalid Employee Data";
		} else {

			boolean flag = departmentRepo.doUpdateDepartment(department);

			if (flag) {
				result = "Department Object Updated";
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;

	}

	/* 
	*//**
		 * 
		 * @param id
		 * @return String It performing FindValidation
		 */

	public String findDepartmentValidation(int id) {
		String result = "";
		Department department;
		if (id == 0) {
			result = "Invalid Id";
		} else {
			department = departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;
	}

	/**
	 * 
	 * @return String It performing Validation for Displaying All Employee
	 */

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}

}