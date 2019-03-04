package com.marlabs.servlet;

public class ProductModel {
	
	private String Productname;
	private double Productprice;
	private String Productseller;
	
	public ProductModel() {
		
	}
	
	
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		Productname = productname;
	}
	public double getProductprice() {
		return Productprice;
	}
	public void setProductprice(double productprice) {
		Productprice = productprice;
	}
	public String getProductseller() {
		return Productseller;
	}
	public void setProductseller(String productseller) {
		Productseller = productseller;
	}
	@Override
	public String toString() {
		return String.format("ProductModel [Productname=%s, Productprice=%s, Productseller=%s]", Productname,
				Productprice, Productseller);
	}
	
	
	
	
	

}
