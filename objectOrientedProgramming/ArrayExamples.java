package com.objectOrientedProgramming;

import java.sql.Array;
import java.util.Arrays;

public class ArrayExamples {
	public static void main(String[] args) {
		int[] marks = {34,56,76,54,34,89,67,98};
		
		for(int mark:marks) {
			System.out.println(mark);
		}
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		String[] marks1=new String[3];
		for(String marK:marks1) {
			System.out.println(marK);
		}
		int[] sony= {1,2,3,4};
		System.out.println(Arrays.toString(sony));
		
		int[] array1= new int[3];
		System.out.println(Arrays.toString(array1));
		Arrays.fill(array1, 100);
		System.out.println(Arrays.toString(array1));
		
		int[] array2= {7,9,2,3,4,5};
		System.out.println(Arrays.equals(array1, array2));
		Arrays.sort(array2);
		System.out.println(Arrays.toString(array2));
		
		
		
	}

}
