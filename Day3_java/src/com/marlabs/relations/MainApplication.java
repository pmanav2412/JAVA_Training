package com.marlabs.relations;

import java.util.Calendar;

public class MainApplication {
	public static void main(String[] args) {
		System.out.println("main method starts....");
		Address localAddress = new Address(123, "123", "amin", 392011, "Bharuch");
		Address PerAddress = new Address(321, "321", "Patel", 110293, "Albany");
		// Set<Address> addressSet = new HashSet<Address>();
		// addressSet.add(localAddress);
		// addressSet.add(PerAddress);

		Employee employee = new Employee(213, "manav");
		employee.localAddress = localAddress;
		employee.permanentAddress = PerAddress;
		// employee.setAddressList(addressSet);
		Employee emp1 = new Employee(312, "ravi");
		emp1.localAddress = localAddress;
		emp1.permanentAddress = PerAddress;

		System.out.println(employee + "\n" + emp1);

		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
	}

}
