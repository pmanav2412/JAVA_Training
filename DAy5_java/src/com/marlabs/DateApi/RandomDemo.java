package com.marlabs.DateApi;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		System.out.println("main methode starts....");

		Random random = new Random();
		float i = random.nextFloat() * 1000;
		System.out.println(i);
		System.out.println("main method ends....");
	}

}
