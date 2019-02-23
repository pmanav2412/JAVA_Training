package com.marlabs.BasicExample;

public class Calculator {
	public int add(int a, int b) {
		if (a < 0 || b < 0) {
			throw new NegativenumberException("Do not add Negative Values");
		}
		return a + b;
	}

	public int devide(int a, int b) {
		if (a < 0 || b < 0) {
			throw new NegativenumberException("Do not add Negative Values");
		}
		if (b == 0) {
			throw new ArithmeticException("Do not enter 0 for denomination");
		}
		return a / b;
	}

}
