package com.marlabs.constructor;

public class Employee {
	int empNumber;
	String empName;
	String empType;
	double empBasic;
	double empComm;
	int empDeptNumber;
	private String empPassWord;
	
	public Employee(int empNumber, String empName, String empType, double empBasic, double empComm, int empDeptNumber) {
		
		this.empNumber = empNumber;
		this.empName = empName;
		this.empType = empType;
		this.empBasic = empBasic;
		this.empComm = empComm;
		this.empDeptNumber = empDeptNumber;
	}
	
	public Employee(Employee e) {
		empNumber = e.empNumber;
		empDeptNumber= e.empDeptNumber;
		empName = e.empName;
		if("contract".equals(e.empType)) {
			empType = "full time";
			empBasic = e.empBasic + 1500.0;
			empComm = e.empComm + 2000.0;
		}
		
	}
	public void DisplayValues() {

		System.out.println("********************************************");
		System.out.println("Employee Number " + "\t" + empNumber);
		System.out.println("Employee name " + "\t" + empName);
		System.out.println("Employee type " + "\t" + empType);
		System.out.println("Employee salary " + "\t" + empBasic);
		System.out.println("Employee commission " + "\t" + empComm);
		System.out.println("********************************************");
	}

}
