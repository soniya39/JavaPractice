package com.objectOrientedProgramming;

public class RectangleRunner {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(13,12);
		System.out.println(rectangle);		
		//System.out.println("Rectanle Area is: "+rectangle.areaOfRectangle());
		//System.out.println("Rectanle Perimeter is: "+rectangle.perimeterofRectangle());
		
		rectangle.setLength(32);
		rectangle.setWidth(45);
		System.out.println(rectangle);		
		//System.out.println("Rectanle Area is: "+rectangle.areaOfRectangle());
		//System.out.println("Rectanle Perimeter is: "+rectangle.perimeterofRectangle());

	}

}
