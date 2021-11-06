package com.objectOrientedProgramming;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class StudentUsingArrayList {
	
	private String name;
	private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();
	
	
	public StudentUsingArrayList(String name,int...listOfMarks) {
		this.name=name;
		for(int mark:listOfMarks) {
			this.listOfMarks.add(mark);
		}
		
		
	}
	public int getNumberOfMarks() {
		
		return listOfMarks.size();
	}
	public int getTotalSumOfMarks() {
		int sumOfMarks=0;
		for(int marks:listOfMarks) {
			sumOfMarks = sumOfMarks + marks;
		}
		return sumOfMarks;
	}
	public int getMaximumMark() {
		
		return Collections.max(listOfMarks);
	}
	public int getMinimumMark() {
		
		return Collections.min(listOfMarks);
	}
	public BigDecimal getAverageMarks() {
		BigDecimal averageMarks;
		BigDecimal sum = new BigDecimal(getTotalSumOfMarks());
		averageMarks = sum.divide(new BigDecimal(listOfMarks.size()),4,RoundingMode.UP);
		return averageMarks;
	}
	public String toString() {
		return name + listOfMarks;
	}
	public void addMarks(int mark) {
		listOfMarks.add(mark);		
	}
	public void removeIndexMarks(int index) {
		listOfMarks.remove(index);		
	}

}
