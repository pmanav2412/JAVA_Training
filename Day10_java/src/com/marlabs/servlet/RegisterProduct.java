package com.marlabs.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.marlabs.servlet.DBUtil;
import java.sql.Connection;
public class RegisterProduct {
		
	public boolean preparedStatement(ProductModel productmodel) throws SQLException {
			PreparedStatement prstatement = null;
			int resultset = 0;
			boolean flag = false;
			Connection connection = null;
			  System.out.println("RegisterProduct");
			try {
				System.out.println("in try db");
				Class.forName("com.mysql.jdbc.Driver");
				 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Product","root","rootroot");
				 System.out.println("end try db");
			} catch (Exception e1) {
				System.out.println("Exception");
				e1.printStackTrace();
			}
		
			try {
				//connection.setAutoCommit(false);
				System.out.println("Database ma avi ne gayu chhe");
				final String INSERT_QUERY = "INSERT INTO products (name, price, seller) VALUES(?,?,?)";
				prstatement = connection.prepareStatement(INSERT_QUERY);
				prstatement.setString(1, productmodel.getProductname());
				prstatement.setDouble(2, productmodel.getProductprice());
				prstatement.setString(3, productmodel.getProductseller());
				
				
				resultset = prstatement.executeUpdate();
				if(resultset>0) {
					flag = true;
				}
				System.out.println(resultset + "Got this result");
				connection.setAutoCommit(true);
				System.out.println("i am here in db try");
				
			} catch (SQLException e) {
				throw new SQLException(e);
				
			} finally {
				try {
					if (prstatement != null) {
						prstatement.close();
					}
					if (connection != null) {
						connection.close();
					}
	
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return flag;
			
		
	}
	
}
