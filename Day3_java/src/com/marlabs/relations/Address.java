package com.marlabs.relations;

public class Address {
	private int streetNumber;
	private String houseNumber;
	private String streetName;
	private long pinCode;
	private String cityName;

	/**
	 * @param streetNumber
	 * @param houseNumber
	 * @param streetName
	 * @param pinCode
	 * @param cityName
	 */
	public Address(int streetNumber, String houseNumber, String streetName, long pinCode, String cityName) {
		this.streetNumber = streetNumber;
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.pinCode = pinCode;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return String.format("Address [streetNumber=%s, houseNumber=%s, streetName=%s, pinCode=%s, cityName=%s]",
				streetNumber, houseNumber, streetName, pinCode, cityName);
	}

}
