package com.marlabs.jsp;

public class Product {

	 String name;
	 double price;
	 String seller;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%s, seller=%s]", name, price, seller);
	}
//
//	Connection con = null;
//
//	public boolean indertData() {
//
//		PreparedStatement prstatement = null;
//
//		Boolean flag = false;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Product", "root", "rootroot");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(name);
//		try {
//			final String INSERT_QUERY = "INSERT INTO products (name,price,seller) VALUES(?,?,?)";
//			prstatement = con.prepareStatement(INSERT_QUERY);
//			prstatement.setString(1, name);
//			prstatement.setDouble(2, price);
//			prstatement.setString(3, seller);
//			int i = prstatement.executeUpdate();
//			if (i > 0) {
//				flag = true;
//			}
//
//		} catch (SQLException e1) {
//
//			e1.printStackTrace();
//		}
//		return flag;

//	}

}
