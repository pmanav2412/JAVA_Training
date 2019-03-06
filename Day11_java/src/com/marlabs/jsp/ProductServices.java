package com.marlabs.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductServices {

	static Connection con = null;

	public boolean indertData(Product p) {

		Boolean flag = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Product", "root", "rootroot");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p.getName());
		try {
			PreparedStatement preparedStatement = con
					.prepareCall("Insert into products (name,price,seller) values(?,?,?)");
			preparedStatement.setString(1, p.getName());
			preparedStatement.setDouble(2, p.getPrice());
			preparedStatement.setString(3, p.getSeller());
			int i = preparedStatement.executeUpdate();
			if (i > 0) {
				flag = true;
			}

		} catch (SQLException e1) {

			e1.printStackTrace();
		}
		return flag;

	}

}
