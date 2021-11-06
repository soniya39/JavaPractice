package com.objectOrientedProgramming;

public class MycharRunner {

	public static void main(String[] args) {
		
		MyChar myChar = new MyChar('B');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsonent());
		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

	}

}
