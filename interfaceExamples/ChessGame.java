package com.interfaceExamples;

public class ChessGame implements GamingConsole{

	@Override
	public void goUp() {
		System.out.println("Move Up");
		
	}

	@Override
	public void goDown() {
		System.out.println("Move Down");
		
	}

	@Override
	public void goLeft() {
		System.out.println("Move Left");
		
	}

	@Override
	public void goRight() {
		System.out.println("Move Right");
		
	}

}
