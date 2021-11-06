package com.objectOrientedProgramming;

public class Customer {
	
	private String name;
	private Address homeAddress;
	private Address workAddress;
	
	
	public Customer(String name, Address homeAddress, Address workAddress) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
	}
	public String toString() {
		return String.format("Customer Name: %s, Home Address: %s and WorkAddress: %s", name,homeAddress,workAddress);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getWorkAddress() {
		return workAddress;
	}
	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}
	
	

}
