package com.marlabs.interfaceVSabstract;

public class interfaceDemo {
	public static void main(String[] args) {

		interfaceClass inter = new interfaceClass();
		inter.f1();
		inter.f2();
		inter.f3();
		inter.f4();
		inter.f5();

		interface1 inter1 = null;
		inter1 = new interfaceClass();
		inter1.f1();
		inter1.f2();

	}
}
