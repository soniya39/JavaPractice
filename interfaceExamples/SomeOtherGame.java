package com.interfaceExamples;

public class SomeOtherGame implements GamingConsole{

	@Override
	public void goUp() {
		System.out.println("Up");
		
	}

	@Override
	public void goDown() {
		System.out.println("Down");
		
	}

	@Override
	public void goLeft() {
		System.out.println("Left");
		
	}

	@Override
	public void goRight() {
		System.out.println("Right");
		
	}

}
