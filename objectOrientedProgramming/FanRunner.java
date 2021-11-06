package com.objectOrientedProgramming;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan fan= new Fan("Ganga",0.34567,"Blue");
		//fan.isOn(true);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed(5);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		

	}

}
