package com.objectOrientedProgramming;

import java.util.Scanner;

public class SwitchExamples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of the day: ");
		int dayNumber = sc.nextInt();
		String nameOfDay = determineNameOfDay(dayNumber);
		if(isWeekDay(dayNumber))
			System.out.println("Is a Week day");
		else
			System.out.println();
		System.out.println(nameOfDay);
		System.out.print("Enter Number of the Month: ");
		int monthNumber = sc.nextInt();
		System.out.println(determineNameOfMonth(monthNumber));

	}

	private static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:			
		case 6:
			return false;
		default:
			return true;

		}

	}

	private static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "TuesDay";
		case 3:
			return "WednesDay";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Invalid dayNumber";
		}
	}

	private static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 0:
			return "January";
		case 1:
			return "February";
		case 2:
			return "March";
		case 3:
			return "April";
		case 4:
			return "May";
		case 5:
			return "June";
		case 6:
			return "July";
		case 7:
			return "August";
		case 8:
			return "Septemebr";
		case 9:
			return "October";
		case 10:
			return "November";
		case 11:
			return "December";
		default:
			return "Invalid MonthNumber";
		}
	}

}
