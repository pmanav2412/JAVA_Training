package com.marlabs.DateApi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar cal1 = new GregorianCalendar();

		int i = cal1.get(Calendar.DATE);
		System.out.println(i);
	}

}
