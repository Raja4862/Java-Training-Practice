package com.dms.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The DBUtil class provides a utility method for establishing a connection to
 * an Oracle database. This class is used by various other components of the
 * Doctor Management System (DMS) to access and perform operations on the
 * database.
 * 
 * The getDBConnection() method loads the Oracle JDBC driver, establishes a
 * connection to the database using the provided URL, user-name, and password,
 * and returns a Connection object that can be used for executing SQL queries.
 * 
 * Note: This class contains hard-coded database connection details, which may
 * need to be updated to match your specific database configuration.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

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
