package com.abstractExamples;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = {new Dog(), new Cat()};
		for(Animal animal:animals) {
			animal.bark();
		}

	}

}
