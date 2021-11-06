package com.objectOrientedProgramming;

import java.math.BigDecimal;

public class StudentUsingVariableArgumentsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		StudentUsingVariableArguments student = new StudentUsingVariableArguments("Sony",56,7,87,89,90,78);////we can pass any number of marks heree..
		StudentUsingVariableArguments student1 = new StudentUsingVariableArguments("Soniya",67,7,6,89); //we can pass any number of marks heree..
		
		int number = student.getNumberOfMarks();
		System.out.println("Number Of Marks: "+number);
		
		int sum=student.getTotalSumOfMarks();
		System.out.println("Sum Of Marks: "+sum);
		
		int maximumMark=student.getMaximumMark();
		System.out.println("Maximum Marks are: "+maximumMark);
		
		int minimumMark=student.getMinimumMark();
		System.out.println("Minimum Marks are: "+minimumMark);
		
		BigDecimal averageMarks=student.getAverageMarks();
		System.out.println("Average Marks are: "+averageMarks);

	}

}
