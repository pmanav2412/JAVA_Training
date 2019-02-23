package com.marlabs.video1;

public class EmployeeDemo {
	public static void main(String args[]) {
		System.out.println("Main Methode Starts:");
		Employee emp = new Employee();
		System.out.println(emp);
		emp.empDeptNumber = 38;
		emp.empNumber =2929;
		emp.DisplayEmployeeDetails();
		
		emp.empName = "manv";
		emp.DisplayEmployeeDetails();
		System.out.println("MAin Methode Ends");
	}

}
