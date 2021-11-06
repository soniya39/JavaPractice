package com.functionalProgramming;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MethodReferenceRunner {
	public static void main(String[] args) {
		//Functional Programming just tells what to do whereas Procedural programming tells How to do.
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("Ant");
		animals.add("Bufellow");
		animals.add("Cat");
		animals.add("Donkey");
		animals.add("Elephant");
		
		animals.stream().map(e->e.length()).forEach(e->System.out.println(e));
		animals.stream().map(e->e.length()).forEach(System.out::println);//Method Reference--here println Method is calling
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(34);
		numbers.add(340);
		numbers.add(347);
		numbers.add(3457);
		numbers.add(3443);
		
		System.out.println(numbers.stream().filter(n->n%2==0).max((n1,n2)->Integer.compare(n1, n2)).get());
		System.out.println(numbers.stream().filter(MethodReferenceRunner::isEven).max(Integer::compare).get());//Method Reference
		
		Predicate<? super Integer> oddPredicate = n->n%2!=0;
		Predicate<? super Integer> evenPredicate = n->n%2==0;//storing functions to variables
		System.out.println(numbers.stream().filter(oddPredicate).max((n1,n2)->Integer.compare(n1, n2)).get());
		
		
	}
	static boolean isEven(int number) {
		return number%2==0;
	}
	

}
