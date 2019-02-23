package com.marlabs.staticMethode;

public class InstanceVSstatic {
	
	static int a;
	int b;
	public void f1() {
		System.out.println("I am f1...");
	}
	public void f2() {
		System.out.println("I am f2...");
		f1();
		
		f3();
	}
	public static void f3() {
		
		System.out.println("I am f3...");
	}
	
	public static void main(String args[]) {
		System.out.println("I am main methode start...");
		f3();
		System.out.println(a);
		InstanceVSstatic v = new InstanceVSstatic();
		System.out.println(a);
		v.f2();
		
		
		System.out.println("I am main methode end...");
	}
	
	static {
		a = 500;
	}
	{
		a = 200;
		b= 300;
	}

}
