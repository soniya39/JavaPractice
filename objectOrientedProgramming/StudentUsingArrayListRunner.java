package com.objectOrientedProgramming;

import java.math.BigDecimal;

public class StudentUsingArrayListRunner {

	public static void main(String[] args) {
		
		 StudentUsingArrayList student = new  StudentUsingArrayList("Sony",56,70,87,89,98,78);		
		
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
		
		System.out.println(student);
		
		student.addMarks(77);
		System.out.println(student);
		
		student.removeIndexMarks(2);
		System.out.println(student);
	}

}
