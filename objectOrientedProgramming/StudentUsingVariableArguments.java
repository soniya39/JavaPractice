package com.objectOrientedProgramming;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StudentUsingVariableArguments {
	
	private String name;
	private int[] listOfMarks;
	
	
	public StudentUsingVariableArguments(String name,int... listOfMarks) {
		this.name=name;
		this.listOfMarks=listOfMarks;
		
	}
	public int getNumberOfMarks() {
		
		return listOfMarks.length;
	}
	public int getTotalSumOfMarks() {
		int sumOfMarks=0;
		for(int marks:listOfMarks) {
			sumOfMarks = sumOfMarks + marks;
		}
		return sumOfMarks;
	}
	public int getMaximumMark() {
		int maximumMarks=Integer.MIN_VALUE;
		for(int marks:listOfMarks) {
			if(marks>maximumMarks)
				maximumMarks = marks;
		}
		return maximumMarks;
	}
	public int getMinimumMark() {
		int minimumMarks=Integer.MAX_VALUE;
		for(int marks:listOfMarks) {
			if(marks<minimumMarks)
				minimumMarks = marks;
		}
		return minimumMarks;
	}
	public BigDecimal getAverageMarks() {
		BigDecimal averageMarks;
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		averageMarks = sum.divide(new BigDecimal(listOfMarks.length),4,RoundingMode.UP);
		return averageMarks;
	}


}
