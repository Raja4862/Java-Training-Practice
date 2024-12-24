package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Praveen_Raja_S
 * @version 1.0 It is Performing all CRUD Operations on List DB
 */
public class EmployeeRepo {

	DepartmentRepo departmentRepo = new DepartmentRepo();

	/**
	 * 
	 * @param employee
	 * @return boolean It is Performing Create employee on List DB
	 */
	public boolean doInsert(Employee employee) {

		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into vspr_emp values(?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, employee.getEmpId());
			ps.setString(2, employee.getEmpName());
			ps.setInt(3, employee.getEmpSalary());
			ps.setInt(4, employee.getDepartment().getDno());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Insert qurey not excute");
			e.printStackTrace();
		}
		return flag;

	}

	/**
	 * @param id
	 * @return boolean It is Performing Delete employee by id on List DB
	 */

	public boolean doDeleteEmployee(int id) {

		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "delete vspr_emp where empid = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Delete qurey not excute");
			e.printStackTrace();
		}

		return flag;

	}

	/**
	 * @param employee
	 * @return boolean It is Performing Update employee on List DB
	 */

	public boolean doUpdateEmployee(Employee employee) {
		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "Update vspr_emp set empname= ?,empsalary = ?,dno = ? where empid = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, employee.getEmpName());
			ps.setInt(2, employee.getEmpSalary());
			ps.setInt(3, employee.getDepartment().getDno());
			ps.setInt(4, employee.getEmpId());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Update qurey not excute");
			e.printStackTrace();
		}
		return flag;

	}

	/**
	 * @param id
	 * @return employee It is Performing Find employee by id on List DB
	 */

	public Employee doFindEmployee(int id) {
		int deptNo;
		Employee employee = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from vspr_emp where empid = ?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empName"));
				employee.setEmpSalary(rs.getInt("empsalary"));

				deptNo = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(deptNo);
				employee.setDepartment(department);

				// employee.setDepartment(rs.getInt());

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return employee;

	}

	/**
	 * @return List It is Performing Display all employee on List DB
	 */

	public List<Employee> doFindAllEmployee() {
		int deptNo;
		Employee employee = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from vspr_emp";
		List<Employee> list = new LinkedList<>();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				employee = new Employee();
				employee.setEmpId(rs.getInt("empid"));
				employee.setEmpName(rs.getString("empName"));
				employee.setEmpSalary(rs.getInt("empsalary"));

				deptNo = rs.getInt("dno");
				Department department = departmentRepo.doFindDepartment(deptNo);
				employee.setDepartment(department);
				list.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

}
