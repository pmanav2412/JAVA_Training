package com.marlabs.inheritance;

public class Employee {
	int empNumber;
	String empDesignation;
	String empName;
	private String empPassword;
	int empDepartment;
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	
	public Employee(int empNumber, String empDesignation, String empName, String empPassword, int empDepartment) {
		
		this.empNumber = empNumber;
		this.empDesignation = empDesignation;
		this.empName = empName;
		this.empPassword = empPassword;
		this.empDepartment = empDepartment;
	}
	
	public void DisplayValues() {
		System.out.println("********************");
		System.out.println("Employee Name"+ "\n" + empName);
	}
}
