package com.ems.repo;

import java.util.Iterator;
import java.util.List;

import com.ems.model.Employee;
import com.ems.util.DBUtil;
/**
 * @author Praveen_Raja_S
 * @version 1.0
 * It is Performing all CRUD Operations on List DB
 */
public class EmployeeRepo {

/**
 * 
 * @param employee
 * @return boolean
 * It is Performing Create employee on List DB
 */
	public boolean doInsert(Employee employee) {

		List<Employee> list = DBUtil.getListDBInstance();
		return list.add(employee);

	}
/**
 * @param id
 * @return boolean
 * It is Performing Delete employee by id on List DB
 */
	public boolean doDelete(int id) {

		boolean flag = false;

		List<Employee> list = DBUtil.getListDBInstance();

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEmpId() == id) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;

	}
/**
 * @param employee
 * @return boolean
 * It is Performing Update employee on List DB
 */

	public boolean doUpdate(Employee employee) {

		boolean flag = false;
		int index = 0;
		List<Employee> list = DBUtil.getListDBInstance();

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEmpId() == employee.getEmpId()) {
				list.set(index, employee);
				flag = true;
				break;
			}
			index++;
		}
		return flag;

	}
	/**
	 * @param id
	 * @return employee
	 * It is Performing Find employee by id on List DB
	 */

	public Employee doFind(int id) {

		Employee employee = null;

		List<Employee> list = DBUtil.getListDBInstance();

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEmpId() == id) {
				employee = temp;
				break;
			}
		}
		return employee;

	}
	/**
	 * @return List
	 * It is Performing Display all employee on List DB
	 */
	public List<Employee> doFindAll() {

		return DBUtil.getListDBInstance();

	}

}
