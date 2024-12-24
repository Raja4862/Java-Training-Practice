package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.ems.model.Employee;

public class DBUtil {

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
		}

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com", "training",
					"Celcom123");
		} catch (SQLException e) {
			System.out.println("Could not connect with DataBase");
		}

		return con;
	}

}
