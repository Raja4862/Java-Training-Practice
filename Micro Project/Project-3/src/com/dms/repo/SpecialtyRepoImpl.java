package com.dms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.dms.model.Specialty;
import com.dms.util.DBUtil;

/**
 * The SpecialtyRepoImpl class provides the implementation for interacting with
 * the database to perform CRUD operations on Specialty entities in the Doctor
 * Management System (DMS).
 * 
 * This class implements the SpecialtyRepo interface, and it uses JDBC to
 * interact with the database to insert, delete, update, and retrieve Specialty
 * records.
 * 
 * The methods in this class interact with the `vspr_specialty` table to manage
 * Specialty data.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class SpecialtyRepoImpl implements SpecialtyRepo {

	public boolean doInsertSpecialty(Specialty specialty) {

		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into vspr_Specialty values(?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, specialty.getSpecId());
			ps.setString(2, specialty.getSpecName());
			ps.setString(3, specialty.getSpecDescription());

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

	public boolean doDeleteSpecialty(int id) {

		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "delete vspr_Specialty where specid = ?";
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

	public boolean doUpdateSpecialty(Specialty specialty) {
		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "Update vspr_SpecialtyRepo set specname = ?, specDescription = ? where specid = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, specialty.getSpecId());
			ps.setString(2, specialty.getSpecName());
			ps.setString(3, specialty.getSpecDescription());

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

	public Specialty doFindSpecialty(int id) {

		Specialty specialty = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from vspr_specialty where specid = ?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				specialty = new Specialty();
				specialty.setSpecId(rs.getInt("specid"));
				specialty.setSpecName(rs.getString("specname"));
				specialty.setSpecDescription(rs.getString("specdescription"));

			}
		} catch (SQLException e) {
			System.out.println("Select Query not Excuted" + e.getMessage());

		}

		return specialty;

	}

	public List<Specialty> doFindAllSpecialty() {
		Specialty specialty = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from vspr_specialty";
		List<Specialty> list = new LinkedList<>();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				specialty = new Specialty();
				specialty.setSpecId(rs.getInt("specid"));
				specialty.setSpecName(rs.getString("specname"));
				specialty.setSpecDescription(rs.getString("specdescription"));
				list.add(specialty);
			}
		} catch (SQLException e) {

			System.out.println("Select Query not Excuted" + e.getMessage());
		}

		return list;

	}

}
