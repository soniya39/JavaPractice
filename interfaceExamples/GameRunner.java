package com.interfaceExamples;

public class GameRunner {
	public static void main(String[] args) {
		
		GamingConsole chessGame = new ChessGame();//or
		//ChessGame chessGame = new ChessGame();
		
		//GamingConsole chessGame = new SomeOtherGame();
		
		chessGame.goUp();
		chessGame.goDown();
		chessGame.goRight();
		chessGame.goLeft();
	}

}
