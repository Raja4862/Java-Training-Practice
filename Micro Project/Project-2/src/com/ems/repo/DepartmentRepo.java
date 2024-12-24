package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.util.DBUtil;

/**
 * @author Praveen_Raja_S
 * @version 1.0 It is Performing all CRUD Operations on List DB
 */
public class DepartmentRepo {

	/**
	 * 
	 * @param employee
	 * @return boolean It is Performing Create employee on List DB
	 */
	public boolean doInsertDepartment(Department department) {

		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into vspr_department values(?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, department.getDno());
			ps.setString(2, department.getDname());

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

	public boolean doDeleteDepartment(int id) {

		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "delete vspr_department where dno = ?";
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

	public boolean doUpdateDepartment(Department department) {
		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "Update vspr_department set dname= ? where dno = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, department.getDname());
			ps.setInt(2, department.getDno());

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

	public Department doFindDepartment(int id) {

		Department department = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from vspr_department where dno = ?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dName"));
				// employee.setDepartment(rs.getInt());

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return department;

	}

	/**
	 * @return List It is Performing Display all employee on List DB
	 */

	public List<Department> doFindAllDepartment() {
		Department department = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from vspr_department";
		List<Department> list = new LinkedList<>();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("dno"));
				department.setDname(rs.getString("dName"));
				list.add(department);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

}
