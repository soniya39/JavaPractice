package com.objectOrientedProgramming;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public String toString() {
		return String.format("Recatnagle length is: %d, width is : %d, Area : %d and Perimeter : %d", length,width,areaOfRectangle(),perimeterofRectangle());
	}
	public int areaOfRectangle() {
		return length*width;
	}
	public int perimeterofRectangle() {
		return 2*(length+width);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	

}
