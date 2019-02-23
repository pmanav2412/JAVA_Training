package com.marlabs.DateApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormate {
	public static void main(String[] args) {
		System.out.println("MAin method starts....");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the jining date ");
		String enterDate = scanner.nextLine();
		SimpleDateFormat simpledateformatter = new SimpleDateFormat("mmm-DD-yyyy");
		try {
			Date date = simpledateformatter.parse(enterDate);

			SimpleDateFormat dateformated = new SimpleDateFormat("MMMM");
			String s = dateformated.format(date);
			// DateFormat formater = DateFormat.getDateInstance();
			// String s = formater.format(date);
			System.out.println(enterDate);
			System.out.println(s);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		System.out.println("main methos ends...");

	}

}
