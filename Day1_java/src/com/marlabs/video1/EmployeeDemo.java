package com.marlabs.video1;

import java.util.StringTokenizer;

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
		
		String s = "Manav Darshan Ravi Anand Ketul bdhjs bd jwb dj d d darshit";
		StringTokenizer st = new StringTokenizer(s);
		while(st.hasMoreTokens()){
			System.out.print("1--  " );
			System.out.println(st.nextToken());
		}
	}

}
