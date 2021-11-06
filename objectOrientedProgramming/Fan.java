package com.objectOrientedProgramming;

public class Fan {
	//state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private int speed;
	
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	public String toString() {
		//return make+radius+color+isOn+speed;
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",make,radius,color,isOn,speed);
	}

	/*
	 * public void isOn(boolean isOn) { this.isOn=isOn; }
	 */
	public void switchOn() {
		this.isOn=true;
		setSpeed(3);
	}
	public void switchOff() {
		this.isOn=false;
		setSpeed(0);
	}
	public void setSpeed(int speed) {		
		this.speed = speed;
		
	}
	
	

}
