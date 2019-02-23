package com.marlabs.testClasses;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.marlabs.BasicExample.DateExamples;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestDateExamples {
	private static DateExamples dateExample;

	@BeforeClass
	public static void init() {
		dateExample = new DateExamples();
	}

	@AfterClass
	public static void Destroy() {
		dateExample = null;
	}

	@Test
	public void TestOne() {
		try {
			String result = dateExample.getWeekDayName("21/02/2019", "dd/MM/yyyy");
			assertEquals("Thursday", result);
		} catch (ParseException e) {
			fail();
		}
	}

	@Test
	public void TestTwo() {
		try {
			String result = dateExample.getWeekDayName("21/02/2019", "dd-MM-yyyy");

		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void TestThree() {
		System.out.println("This is fail for null in date value");
		try {
			String result = dateExample.getWeekDayName(null, "dd-MM-yyyy");

		} catch (ParseException e) {

			fail();
		}

	}

	@Test(expected = NullPointerException.class)
	public void TestFour() {
		System.out.println("This is fail for null in formate");
		try {
			String result = dateExample.getWeekDayName("21/02/2019", null);

		} catch (ParseException e) {

			fail();
		}

	}

}
