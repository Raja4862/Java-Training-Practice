package com.day13;

// Insert

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// #-1 Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// #-2 Making Connection with Database
		// Connection con =
		// DriverManager.getConnection("jdbc:orcale:thin:@172.19.0.5:1521:trainingsql.celcom.com","training","Celcom123");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");

		// #-3 Creating Statement
		String sql = "insert into vspr_emp values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);

		// #-4 Executing the Query
		Object employee[][] = new Object[][] { { 121, "ajay", 345, 1 }, { 122, "prag", 3211, 1 }

		};

		for (int i = 0; i < employee.length; i++) {
			ps.setInt(1, (Integer) employee[i][0]);
			ps.setString(2, (String) employee[i][1]);
			ps.setInt(3, (Integer) employee[i][2]);
			ps.setInt(4, (Integer) employee[i][3]);
			ps.addBatch();
		}

		int[] n = ps.executeBatch();// insert, delete, update

		for (int i = 0; i < n.length; i++) {
			System.out.println("Statement " + i + " affected " + n[i] + " rows.");
		}

		// #-5
		ps.close();
		con.close();
	}

}
