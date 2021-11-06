package com.objectOrientedProgramming;

public class MyNumber {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				count++;
		}
		if (count == 2) {
			return true;
		}
		return false;
	}

	public int sumUptoN() {
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sumOfDivisors = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sumOfDivisors = sumOfDivisors + i;
			}
		}
		return sumOfDivisors;
	}

	public void printNumberTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}

	}

}
