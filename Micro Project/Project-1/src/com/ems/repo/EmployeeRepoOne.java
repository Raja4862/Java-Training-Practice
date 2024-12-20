package com.ems.repo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Praveen_Raja_S
 * @version 1.0
 * It is Performing all CRUD Operations on MAP DB
 */

public class EmployeeRepoOne {
/**
 * 
 * @param employee
 * @return boolean
 *  It is Performing Create employee on MAP DB
 */
	public boolean doInsert(Employee employee) {


		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		map.put(employee.getEmpId(), employee);
		return true;
	}
/**
 * 
 * @param id
 * @return boolean
 *  It is Performing Delete employee by id on MAP DB
 */
 
	public boolean doDelete(int id) {

		boolean flag = false;

		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(id)) {
			map.remove(id);
			flag = true;
		}
		return flag;
	}
/**
 * 
 * @param employee
 * @return boolean
 *  It is Performing Update employee on MAP DB
 */
	public boolean doUpdate(Employee employee) {

		boolean flag = false;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		if (map.containsKey(employee.getEmpId())) {

			map.put(employee.getEmpId(), employee);
			flag = true;
		}
		return flag;

	}
/**
 * 
 * @param id
 * @return employee
 *  It is Performing Find employee by id on MAP DB
 */


	public Employee doFind(int id) {

		Employee employee = null;
		Map<Integer, Employee> map = DBUtil.getMapDBInstance();

		if (map.containsKey(id)) {
			employee = map.get(id);
		}
		return employee;

	}
/**
 * 
 * @return list
 *  It is Performing Display all employee on MAP DB
 */

	public List<Employee> doFindAll() {



		Map<Integer, Employee> map = DBUtil.getMapDBInstance();
		Collection<Employee> collection = map.values();
		List<Employee> list = new LinkedList<>();
		for (Employee e : collection) {
			list.add(e);
		}
		return list;

	}

}
