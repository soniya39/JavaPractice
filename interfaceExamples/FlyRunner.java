package com.interfaceExamples;

import java.util.ArrayList;

public class FlyRunner {
	public static void main(String[] args) {

		Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
		for (Flyable flyingObject:flyingObjects) {
			flyingObject.fly(); //Plomorphism:same action with different behaviour.
		}
	}
}
