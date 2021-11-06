package com.objectOrientedProgramming;

public class Menu {
	private int number1;
	private int number2;
	Menu(int number1,int number2){
		this.number1= number1;
		this.number2=number2;
		
	}
	
	public void operationUsingNestedIf(int selectedOption) {
		if(selectedOption==1)
			System.out.println(number1+number2);
		else if(selectedOption==2)
			System.out.println(number1-number2);
		else if(selectedOption==3)
			System.out.println(number1*number2);
		else if(selectedOption==4)
			System.out.println(number1/number2);
		else
			System.out.println("Invalid Operation");
		
	}
	public void operationUsingSwitch(int selectedOption) {
		switch(selectedOption){
		case 1 : System.out.println(number1+number2);
		break;	
		case 2 : System.out.println(number1-number2);
		break;
		case 3 : System.out.println(number1*number2);
		break;
		case 4 : System.out.println(number1/number2);
		break;
		default: System.out.println("Thank you");
		
	}

}
}
