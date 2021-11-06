package com.objectOrientedProgramming;

import java.util.Scanner;

public class WhileNumberPlayer {
	private int limit;
	Scanner sc = new Scanner(System.in);

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i < limit) {
			System.out.println(i * i);
			i++;
		}
	}

	public void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.println(i * i * i);
			i++;
		}
	}

	public void printCubeUntilNegativeNuumber() {
		int number;
		do {
			System.out.print("Enter a Number: ");
			number = sc.nextInt();
			if (number >= 0)
				System.out.println("Cube is " + number * number * number);			
				
		} while (number >= 0);
		System.out.println("Thank You! Have Fun!");

	}

}
