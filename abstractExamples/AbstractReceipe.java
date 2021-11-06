package com.abstractExamples;

public abstract class AbstractReceipe {
	
	public void execute() {
		getReady();
		prpareTheDish();
		serveTheDish();
		cleanTheKitchen();
	}
	
	abstract void getReady(); //In abstarct methods we will not give actual implementation.
	abstract void prpareTheDish();//means we will not declare the body..
	abstract void serveTheDish();//The actual implementation will be in Inherited class.
	abstract void cleanTheKitchen();

}
