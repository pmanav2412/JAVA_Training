package com.marlabs.ioExample;

import java.io.Serializable;

public class Customer implements Serializable {
  
private int cutomerID;
  private String customerName;
  private transient String CustomerPassword;
  private String CustomerCity;
  private long CustomerPin;
/**
 * @param cutomerID
 * @param customerName
 * @param customerPassword
 * @param customerCity
 * @param customerPin
 */
public Customer(int cutomerID, String customerName, String customerPassword, String customerCity, long customerPin) {
	this.cutomerID = cutomerID;
	this.customerName = customerName;
	CustomerPassword = customerPassword;
	CustomerCity = customerCity;
	CustomerPin = customerPin;
}
@Override
public String toString() {
	return String.format(
			"Customer [cutomerID=%s, customerName=%s, CustomerPassword=%s, CustomerCity=%s, CustomerPin=%s]", cutomerID,
			customerName, CustomerPassword, CustomerCity, CustomerPin);
}
  
  
}
