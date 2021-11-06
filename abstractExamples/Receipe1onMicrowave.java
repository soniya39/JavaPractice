package com.abstractExamples;

public class Receipe1onMicrowave extends AbstractReceipe{

	@Override
	void getReady() {
		System.out.println("Get the Essentials");
		System.out.println("Switch on Microwave");
		
	}

	@Override
	void prpareTheDish() {
		System.out.println("Cook on MicroWave");
		System.out.println("Switch Off");
		
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
