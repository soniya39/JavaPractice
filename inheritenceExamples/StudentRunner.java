package com.inheritenceExamples;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student = new Student("Sony","abc");
		//student.setName("Soniya"); //due to Inheritance of Person class in Student class we have these attributes in Student class also.
		student.setMailId("abc@.com");
		student.setCollegeName("SPMVVV");
		
		Person person = new Person("Sony");
		person.toString();//By default all classes are extends Object class(if we don't specify any inheritance class) which is inbuilt in Java..we have some predefined methods in Object class
		person.hashCode();//such as toString(),hashCode() etc.. 
		
		Employee employee = new Employee("sony","nalla");
		//employee.setName("Soniya");
		employee.setPhoneNumber("67556655");
		employee.setTitle("Nalla");
		employee.setSalary(new BigDecimal(3456789.0));
		System.out.println(employee);

	}

}
