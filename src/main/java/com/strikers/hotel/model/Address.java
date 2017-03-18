package com.strikers.hotel.model;

public class Address {
	
	private String line1;
	private String line2;
	private Code city;
	private Code country;
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public Code getCity() {
		return city;
	}
	public void setCity(Code city) {
		this.city = city;
	}
	public Code getCountry() {
		return country;
	}
	public void setCountry(Code country) {
		this.country = country;
	}

	
	
}
