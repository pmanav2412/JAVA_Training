package com.marlabs.video1;

public class Employee {
	int empNumber;
	String empName;
	String empType;
	double empBasic;
	double empComm;
	int empDeptNumber;
	private String empPassWord;
	
	public void DisplayEmployeeDetails(){
		System.out.println("*******************************************************");
		System.out.println("Employee Number:" + "\t" + empNumber);
		System.out.println("Employee name:" + "\t" + empName);
		System.out.println("Employee Type:" + "\t" + empType);
		System.out.println("Employee Salary:" + "\t" + empBasic);
		System.out.println("Employee Commission:" + "\t" + empComm);
		System.out.println("*******************************************************");
		
	}
	

}
