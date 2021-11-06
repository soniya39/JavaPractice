package com.objectOrientedProgramming;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		int[] listOfMarks= {31,49,20};
		Student student = new Student("Sony",listOfMarks);
		Student student2 = new Student("Soniya",new int[] {23,98,34}); //we can pass array directly like this
		
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
