package com.marlabs.DateApi;

import java.util.Date;

public class DateAPIDemo {
	public static void main(String[] args) {
		System.out.println("main method starts......");

		Date date = new Date();
		System.out.println(date.toString());

		Date date1 = new Date(1994 - 1900, 11, 24);
		System.out.println(date1);
		System.out.println("main method ends.............");
	}

}
