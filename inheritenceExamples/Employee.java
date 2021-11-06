package com.inheritenceExamples;

import java.math.BigDecimal;

public class Employee extends Person{
	
	private String title;
	private String employer;
	private String employeeGrade;
	private BigDecimal salary;
	
	public Employee(String name, String title) {
		super(name);
		this.title = title;
	}
	public String toString() {
		//return super.toString()+" "+title+" "+salary; //or
		return super.getName()+" "+title+" "+salary; //if we want any specific attribute value
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(String employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	

}
