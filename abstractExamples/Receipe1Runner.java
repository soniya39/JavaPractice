package com.abstractExamples;

public class Receipe1Runner {

	public static void main(String[] args) {
		
		Receipe1 receipe1 = new Receipe1();
		receipe1.execute(); //This execute method is there in Abstarct class
		
		Receipe1onMicrowave receipe1onMicrowave = new Receipe1onMicrowave();
		receipe1onMicrowave.execute();

	}

}
