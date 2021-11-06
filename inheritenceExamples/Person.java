package com.inheritenceExamples;

public class Person {
	
	private String name;
	private String mailId;
	private String phoneNumber;
	
	public Person(String name) {
		System.out.println("Person Constructor");
		this.name= name;
		
	}
	public String toString() {
		return name+" "+mailId+" "+phoneNumber;
	}
	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
}	
	
