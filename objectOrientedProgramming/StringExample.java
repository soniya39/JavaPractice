package com.objectOrientedProgramming;

public class StringExample {
	public static void main(String[] args) {
		String str1="This is String Example String";
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5, 14));
		System.out.println(str1.indexOf("String"));
		System.out.println(str1.indexOf("String", 15 ));
		System.out.println(str1.indexOf('i'));
		System.out.println(str1.lastIndexOf('i'));
		for (int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));			
		}
	}
	

}
 