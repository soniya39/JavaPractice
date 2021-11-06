package com.objectOrientedProgramming;

public class StringArrayExample {
	
	private static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	public static void main(String[] args) {
		
		System.out.println("Longest Day in Letters: "+longestDayinLetters());
		daysOfWeekInBackward();

	}
	public static String longestDayinLetters() {
		int lengthOfDay =0;
		String longestDayinLetters = null;
		for(String day:days) {
			if(day.length() > lengthOfDay) {							
				longestDayinLetters = day;
				lengthOfDay=day.length();
			}
			
		}
		return longestDayinLetters;
	}
	public static void daysOfWeekInBackward() {
		for(int i=days.length -1;i>=0;i--) {
			System.out.println(days[i]);
		}
	}

}
