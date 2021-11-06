package com.objectOrientedProgramming;

public class Address {
	
	private String line1;
	private String village;
	private String city;
	private String zip;
	private String state;
	
	public Address(String line1, String village, String city, String zip, String state) {
		super();
		this.line1 = line1;
		this.village = village;
		this.city = city;
		this.zip = zip;
		this.state = state;
	}
	public String toString() {
		return String.format(" %s,%s,%s,%s,%s",line1,village,city,zip,state);
	}
	
	

}
