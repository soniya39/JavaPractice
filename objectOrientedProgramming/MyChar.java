package com.objectOrientedProgramming;

public class MyChar {
	
	private char ch;
	
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public MyChar(char ch) {
		this.ch= ch;
	}
	
	public boolean isVowel() {
		
		if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			return true;			
		return false;		
	}
	
	public boolean isConsonent() {		
		if(isAlphabet() && !isVowel())
				return true;			
		return false;		
	}
	
	public boolean isDigit() {
		if((int)ch>=48 && (int)ch<=57) 
			return true; 
		return false;
	}
	 
	public boolean isAlphabet() {
		int alphabet =(int)ch;
		if((alphabet >= 65 && alphabet <=90) || (alphabet >=97 && alphabet<=122)) 
			return true;	
		return false;		
	}
	public static void printLowerCaseAlphabets() {
		for(char i='a';i<='z';i++) {
			System.out.print(i);			
		}	
		System.out.print("\n");
	}
	public static void printUpperCaseAlphabets() {
		for(char i=65;i<=90;i++) {
			System.out.print(i);
	}

}
}
