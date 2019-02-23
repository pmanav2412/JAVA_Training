package com.marlabs.constructor;

public class EmployeeDemo {
	public static void main(String args[]) {
		System.out.println("main methode starts");
		Employee emp = new Employee(29,"manav","contract",85000.0,8000.00,3);
		Employee emp1 = new Employee(emp);
		emp.DisplayValues();
		emp1.DisplayValues();
		System.out.println("main methode ends");
	}

}
