package com.objectOrientedProgramming;

public class MotorBike {
	private int speed;
	void start(){
		System.out.println("Bike Started");		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed>0)
		this.speed = speed;
	}
	

}
