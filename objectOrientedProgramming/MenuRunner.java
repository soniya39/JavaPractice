package com.objectOrientedProgramming;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = sc.nextInt();
		System.out.print("Enter Number2: ");
		int number2 = sc.nextInt();
		int choice;
		do {
		System.out.println("Choose one option: \n 1. Add \n 2. Subtract \n 3. Multiplication \n 4. Division \n 5. Exit");
		choice = sc.nextInt();
		Menu menu=new Menu(number1,number2);	
		menu.operationUsingSwitch(choice);
		//menu.operationUsingNestedIf(choice);
		}while(choice!=5);
		
	

	}

}
