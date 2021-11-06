package com.inheritenceExamples;

public class Student extends Person{
	
	private String collegeName;
	private String yearOfStudy;
	
	public Student(String name, String collegeName) {
		super(name);
		this.collegeName = collegeName;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getYearOfStudy() {
		return yearOfStudy;
	}
	public void setYearOfStudy(String yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}	

}
