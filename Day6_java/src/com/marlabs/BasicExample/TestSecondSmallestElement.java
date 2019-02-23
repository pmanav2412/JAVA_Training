package com.marlabs.BasicExample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.marlabs.collections.SecondSmallestElementExample;

public class TestSecondSmallestElement {
	private static SecondSmallestElementExample secInstance;

	@BeforeClass
	public static void init() {
		secInstance = new SecondSmallestElementExample();

	}

	@AfterClass
	public static void Destroy() {
		secInstance = null;
	}

	@Test
	public void Test1() {
		System.out.println("This IS test 1");
		try {
			int a[] = { 4, 5, 2 };
			int result = secInstance.getSecondSmallestElement(a);
			assertEquals(4, result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
