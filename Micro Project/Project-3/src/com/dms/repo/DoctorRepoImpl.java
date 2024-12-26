package com.dms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.dms.model.Doctor;
import com.dms.model.Specialty;
import com.dms.util.DBUtil;

/**
 * The DoctorRepoImpl class provides the implementation for interacting with the
 * database for CRUD operations on Doctor entities in the Doctor Management
 * System (DMS).
 * 
 * It implements the DoctorRepo interface and uses JDBC to perform operations
 * such as inserting, deleting, updating, and retrieving Doctor records from the
 * database.
 * 
 * This class also makes use of the SpecialtyRepoImpl to retrieve the specialty
 * of each doctor.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class DoctorRepoImpl implements DoctorRepo {

	SpecialtyRepo specialtyrepo = new SpecialtyRepoImpl();

	public boolean doDoctorInsert(Doctor doctor) {

		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into vspr_doctor values(?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setInt(1, doctor.getDocId());
			ps.setString(2, doctor.getDocName());
			ps.setInt(3, doctor.getDocContact());
			ps.setInt(4, doctor.getSpeciality().getSpecId());

			int n = ps.executeUpdate();
			if (n == 1) {
				flag = true;
			}

		} catch (SQLException e) {
			System.out.println("Insert Qurey not excute");
			e.printStackTrace();
		}
		return flag;

	}

	public boolean doDeleteDoctor(int id) {

		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "delete vspr_doctor where docid = ?";
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

	public boolean doUpdateDoctor(Doctor doctor) {
		boolean flag = false;
		Connection con = DBUtil.getDBConnection();
		String sql = "Update vspr_doctor set docname= ?,doccontact = ?,specid = ? where docid = ?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, doctor.getDocName());
			ps.setInt(2, doctor.getDocContact());
			ps.setInt(3, doctor.getSpeciality().getSpecId());
			ps.setInt(4, doctor.getDocId());

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

	public Doctor doFindDoctor(int id) {
		int specId;
		Doctor doctor = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from vspr_doctor where docid = ?";
		PreparedStatement ps;

		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				doctor = new Doctor();

				doctor.setDocId(rs.getInt("docid"));
				doctor.setDocName(rs.getString("docname"));
				doctor.setDocContact(rs.getInt("doccontact"));

				specId = rs.getInt("specid");
				Specialty specialty = specialtyrepo.doFindSpecialty(specId);
				doctor.setSpeciality(specialty);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return doctor;

	}

	public List<Doctor> doFindAllDoctor() {
		int specId;
		Doctor doctor = null;
		Connection con = DBUtil.getDBConnection();
		String sql = "select * from vspr_doctor";
		List<Doctor> list = new LinkedList<>();
		PreparedStatement ps;
		ResultSet rs;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {

				doctor = new Doctor();

				doctor.setDocId(rs.getInt("docid"));
				doctor.setDocName(rs.getString("docname"));
				doctor.setDocContact(rs.getInt("doccontact"));

				specId = rs.getInt("specid");
				Specialty specialty = specialtyrepo.doFindSpecialty(specId);
				// doctor.setSpeciality(specialty.getSpecId());
				doctor.setSpeciality(specialty);

				list.add(doctor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

}
