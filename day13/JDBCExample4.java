package com.day13;

// Select

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBCExample4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// #-1 Loading Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// #-2 Making Connection with Database
		// Connection con =
		// DriverManager.getConnection("jdbc:orcale:thin:@172.19.0.5:1521:trainingsql.celcom.com","training","Celcom123");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com",
				"training", "Celcom123");
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDriverName());
		

		// #-3 Creating Statement
		String sql = "Select * from vspr_emp";
		PreparedStatement ps = con.prepareStatement(sql);

		// #-4 Executing the Query
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsd = rs.getMetaData();
		System.out.println(rsd.getColumnCount());
		for (int i = 1; i <= rsd.getColumnCount(); i++) {
			System.out.println(rsd.getColumnName(i));
		}
		while (rs.next()) {
			System.out.println(rs.getInt("empid") + " " + rs.getString("empname") + " " + rs.getInt("empsalary") + " "
					+ rs.getInt("dno"));
		}

		// #-5
		ps.close();
		con.close();
	}

}
