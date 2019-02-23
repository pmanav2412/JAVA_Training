package com.marlabs.objectClass;

public class Customer {
	int CustomerNumber;
	private String CustomerID;
	private String CustomerPassword;
	private String CustomerAddreess;

	/**
	 * @param customerNumber
	 * @param customerID
	 * @param customerPassword
	 * @param customerAddreess
	 * @return
	 */

	public Customer(int customerNumber, String customerID, String customerPassword, String customerAddreess) {
		CustomerNumber = customerNumber;
		CustomerID = customerID;
		CustomerPassword = customerPassword;
		CustomerAddreess = customerAddreess;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CustomerAddreess == null) ? 0 : CustomerAddreess.hashCode());
		result = prime * result + ((CustomerID == null) ? 0 : CustomerID.hashCode());
		result = prime * result + CustomerNumber;
		result = prime * result + ((CustomerPassword == null) ? 0 : CustomerPassword.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (CustomerAddreess == null) {
			if (other.CustomerAddreess != null)
				return false;
		} else if (!CustomerAddreess.equals(other.CustomerAddreess))
			return false;
		if (CustomerID == null) {
			if (other.CustomerID != null)
				return false;
		} else if (!CustomerID.equals(other.CustomerID))
			return false;
		if (CustomerNumber != other.CustomerNumber)
			return false;
		if (CustomerPassword == null) {
			if (other.CustomerPassword != null)
				return false;
		} else if (!CustomerPassword.equals(other.CustomerPassword))
			return false;
		return true;
	}

}
