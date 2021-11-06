package com.abstractExamples;

public class Receipe1 extends AbstractReceipe{

	@Override
	void getReady() {
		System.out.println("Get the Essentials");
		
	}

	@Override
	void prpareTheDish() {
		System.out.println("Cook on Stove");
		
	}

	@Override
	void serveTheDish() {
		System.out.println("Serve on Dining Table");
		
	}

	@Override
	void cleanTheKitchen() {
		System.out.println("Clean the Kitchen");
		
	}
	

}
