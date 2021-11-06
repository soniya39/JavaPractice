package com.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Banana");
		list1.add("Mango");
		list1.add("Pineapple");
		list1.add("Apple");
		displayElementsUsingFP(list1);
		displayElementsUsingFPWithFiltering(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(45);
		list2.add(65);
		list2.add(98);
		displayNumbersUsingFP(list2);
		displayOddNumbersUsingFP(list2);
		displayEvenNumbersUsingFP(list2);
		sumOfNumbersUsingFP(list2);
		sumOfOddNumbersUsingFP(list2);
		maxNumberUsingFP(list2);
		squareOfFirst10Integers();
		displayElementsInLowerCase(list1);
		printLengthOfEachElement(list1);
			

	}
	// -> lamda expression..Here we are passing Function to forEach
	public static void displayElementsUsingFP(ArrayList<String> list) {
		list.stream().forEach(
				element -> System.out.println(element));
	
	}
	public static void displayElementsUsingFPWithFiltering(ArrayList<String> list) {
		list.stream()
					.filter(element -> element.endsWith("le"))
					.forEach(element -> System.out.println(element));
	
	}
	public static void displayNumbersUsingFP(ArrayList<Integer> list) {
		list.stream().forEach(
				number -> System.out.println(number));
	
	}
	public static void displayOddNumbersUsingFP(ArrayList<Integer> list) {
		list.stream()
		.filter(number -> (number % 2 != 0))
		.forEach(
				number -> System.out.println("Odd Number "+number));
		List numbersList =list.parallelStream().filter(number -> (number%2 ==1)).collect(Collectors.toList());
		System.out.println(numbersList);//gives as a list
	
	}
	public static void displayEvenNumbersUsingFP(ArrayList<Integer> list) {
		list.stream()
		.filter(number -> (number % 2 == 0))
		.forEach(
				number -> System.out.println("Even Number "+number));
	
	}
	public static void sumOfNumbersUsingFP(ArrayList<Integer> list) {
		int sum=list.stream().
				reduce(0,(number1,number2) -> number1+number2);	//1st adds 0,45 next 45,65 next 110,98 and gives total
		System.out.println(sum);

	}
	public static void sumOfOddNumbersUsingFP(ArrayList<Integer> list) {
		int sum=list.stream().filter(number -> number % 2 !=0).
				reduce(0,(number1,number2) -> number1+number2);	
		System.out.println("odd numbers sum "+sum);

	}
	public static void maxNumberUsingFP(ArrayList<Integer> list) {
		int sum=list.stream().max((n1,n2)-> Integer.compare(n1,n2)).get();
					
		System.out.println("Maximum number "+sum);

	}
	//Intermediate stream operations: filter, sorted, distinct etc..- we are streaming inputs and filtering particular inputs based on conditions and giving another stream.
	//stream can have multiple Intermediate stream operations
	//Terminal operations:reduce,max,min,etc..--we are streaming the input and doing calculations on all.
	//only one Terminal operations allowed on stream.
	
	public static void squareOfFirst10Integers() {
			
		/*IntStream.range(1, 11).forEach(
				number -> System.out.println("Square Of Number:  "+number*number));*/ //or
		IntStream.range(1, 11).map(e -> e*e).forEach(
				number -> System.out.println("Square Of Number:  "+number));
		System.out.println(IntStream.range(1, 11).map(e -> e*e).boxed().collect(Collectors.toList()));//returns as a List

	}
	public static void displayElementsInLowerCase(ArrayList<String> list) {
		list.stream().forEach(
				element -> System.out.println("Lowe Case "+element.toLowerCase()));
	
	}
	public static void printLengthOfEachElement(ArrayList<String> list) {
		list.stream().forEach(
				element -> System.out.println("Length of  "+element+" "+element.length()));
	
	}

}
