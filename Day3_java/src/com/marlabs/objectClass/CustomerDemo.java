package com.marlabs.objectClass;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer cus = new Customer(2312, "12", "123", "654");
		Customer cus1 = new Customer(2312, "12", "123", "654");

		System.out.println(cus + "\n" + cus1);

		int i = cus.hashCode();
		int ii = cus1.hashCode();
		System.out.println(i + "\n" + ii);
		StringBuffer d = new StringBuffer("manav");
		d.reverse();

		System.out.println(d);

	}

}
