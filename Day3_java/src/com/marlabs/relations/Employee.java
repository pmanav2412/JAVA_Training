package com.marlabs.relations;

public class Employee {
	int empNumber;
	String empName;
	Address localAddress;
	Address permanentAddress;
	// private Set<Address> addressList;
	//
	// public Set<Address> getAddressList() {
	// return addressList;
	// }
	//
	// public void setAddressList(Set<Address> addressList) {
	// this.addressList = addressList;
	// }

	/**
	 * @param empNumber
	 * @param empName
	 */
	public Employee(int empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return String.format("Employee [empNumber=%s, empName=%s, localAddress=%s, permanentAddress=%s]", empNumber,
				empName, localAddress, permanentAddress);
	}

}
