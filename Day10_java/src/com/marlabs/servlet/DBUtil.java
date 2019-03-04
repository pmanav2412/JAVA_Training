package com.marlabs.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private DBUtil() {

	}
	
	final static Connection getConnection() throws SQLException {
		Connection con = null;
		System.out.println("Connection to ave chhe");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/products","root","rootroot");
			System.out.println("sthapay chhe");
	
		} catch (ClassNotFoundException e) {
			System.out.println("catch");
			e.printStackTrace();
			
		}
		System.out.println("sthapay chhe!!!!");
		 return con;
		
	}

	
}

