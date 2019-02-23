package com.marlabs.testClasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.marlabs.BasicExample.Calculator;
import com.marlabs.BasicExample.NegativenumberException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {
	private static Calculator cal = null;

	@BeforeClass
	public static void init() {
		System.out.println("i am from init method");
		cal = new Calculator();

	}

	@AfterClass
	public static void destroy() {
		System.out.println("I am Destroy method");
		cal = null;
	}

	@Test
	public void testAdd() {

		try {
			int result = cal.add(20, 30);
			assertEquals(50, result);
		} catch (NegativenumberException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void testadd1() {
		Calculator cal = new Calculator();
		System.out.println("i am from add 0*********");
		try {
			int result = cal.add(-20, 30);
			System.out.println(result);
		} catch (NegativenumberException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void TestDevide() {
		System.out.println("i am from devide 0*********");
		try {

			int result = cal.devide(10, 5);
			assertEquals(2, result);

		} catch (NegativenumberException e) {
			fail();
		} catch (ArithmeticException e) {
			fail();
		}
	}

	@Test(expected = ArithmeticException.class)
	public void TestDevide1() {
		System.out.println("i am from devide 1************");
		// try {
		int result = cal.devide(10, 0);
		// } catch (NegativenumberException e) {
		// fail();
		// } catch (ArithmeticException e) {
		// System.out.println(e.getMessage());
		// }
	}

	@Test
	public void TestDevide2() {
		System.out.println("i am from devide 2***************");
		try {
			int result = cal.devide(10, -2);
		} catch (NegativenumberException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			fail();
		}
	}

}
