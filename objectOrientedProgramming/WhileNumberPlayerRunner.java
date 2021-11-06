package com.objectOrientedProgramming;

import java.util.Scanner;

public class WhileNumberPlayerRunner {
	public static void main(String[] args) {

		WhileNumberPlayer player = new WhileNumberPlayer(100);
		player.printSquaresUptoLimit();
		player.printCubesUptoLimit();
		player.printCubeUntilNegativeNuumber();
	}

}
