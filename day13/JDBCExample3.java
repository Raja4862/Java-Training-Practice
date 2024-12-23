package com.day13;

// Update

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// #-1 Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// #-2 Making Connection with Database
		// Connection con =
		// DriverManager.getConnection("jdbc:orcale:thin:@172.19.0.5:1521:trainingsql.celcom.com","training","Celcom123");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");

		// #-3 Creating Statement
		String sql = "update vspr_emp SET empsalary = ? where empid = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		// #-4 Executing the Query
		ps.setInt(1, 20000);
		ps.setInt(2, 13);

		int n = ps.executeUpdate();// insert, delete, update

		if (n == 1) {
			System.out.println("Updated successfully");
		} else {
			System.out.println("not Updated successfully");
		}

		// #-5
		ps.close();
		con.close();
	}

}
