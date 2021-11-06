package com.objectOrientedProgramming;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		if(number.isPrime()) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		System.out.println("Sum upto Numbers: "+number.sumUptoN());
		System.out.println("Sum of Divisors: "+number.sumOfDivisors());
		number.printNumberTriangle();

	}

}
