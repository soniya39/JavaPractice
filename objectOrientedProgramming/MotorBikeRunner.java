package com.objectOrientedProgramming;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		

		ducati.setSpeed(1000);
		System.out.println(ducati.getSpeed());
		honda.setSpeed(80);
		System.out.println(honda.getSpeed());
		
	}

}
