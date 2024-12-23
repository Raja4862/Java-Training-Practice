package com.day13;

// Delete

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// #-1 Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// #-2 Making Connection with Database
		// Connection con =
		// DriverManager.getConnection("jdbc:orcale:thin:@172.19.0.5:1521:trainingsql.celcom.com","training","Celcom123");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");

		// #-3 Creating Statement
		String sql = "delete vspr_emp where empid=(?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// #-4 Executing the Query
		ps.setInt(1, 13);

		int n = ps.executeUpdate();// insert, delete, update

		if (n == 1) {
			System.out.println("Deleted successfully");
			
		} else {
			System.out.println("not Deleted successfully");
		}

		// #-5
		ps.close();
		con.close();
	}

}
