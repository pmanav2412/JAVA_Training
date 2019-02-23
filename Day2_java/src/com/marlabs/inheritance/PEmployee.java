package com.marlabs.inheritance;

public class PEmployee extends Employee{
	int empBasic;
	
	public PEmployee(int empBasic, int empNumber, String empDesignation, String empName, String empPassword, int empDepartment) {
		super(empNumber, empDesignation, empName, empPassword, empDepartment);
		this.empBasic = empBasic;
		// TODO Auto-generated constructor stub
	}
	
	
	private double takeHomeSalary() {
		double takehome = 0.0;
		int empCommission= (int) (empBasic*0.1);
		int empBonus = (int) (empBasic*0.1);
		if(empDepartment == 10) {
			takehome = Math.round(empBasic + empBonus + empCommission);
		}
		
		return takehome;
	}
	
	@Override
	public void DisplayValues() {
		super.DisplayValues();
		System.out.println("********************");
		System.out.println("Employee Name"+ "\t" + empName);
		double takehome = takeHomeSalary();
		System.out.println("take home salary"+ "\t" + takehome);
	}
	

}
