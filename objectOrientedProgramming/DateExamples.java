package com.objectOrientedProgramming;

import java.time.*;
import java.util.Date;


public class DateExamples {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now(); 
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(date+"   "+time+"   "+dateTime);
		
		LocalDate today =LocalDate.now();
		System.out.println(today.getYear()+"  "+today.getDayOfWeek()+"   "+today.getDayOfYear());
		System.out.println(today.isLeapYear());
		System.out.println(today.lengthOfYear());
		
		LocalDate yesterday=LocalDate.of(2021, 07, 15);
		System.out.println(today.isAfter(yesterday));
		
	}

}
