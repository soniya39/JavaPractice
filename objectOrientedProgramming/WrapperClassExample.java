package com.objectOrientedProgramming;

public class WrapperClassExample {

	public static void main(String[] args) {
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(i1==i2);//Here two objects created.
		
		Integer i3=Integer.valueOf(12);
		Integer i4=Integer.valueOf(12);
		System.out.println(i3==i4);//Here only one object created bcz 12 is already there so i4 will reference to same object
		
		Integer i5=67;
		Integer i6=67;
		System.out.println(i5);
		System.out.println(i5==i6);
		i1.valueOf(13);
		System.out.println(i1);//i=10  we can't change the value of Wrapper class
		
		Boolean a=new Boolean("True");
		Boolean b= Boolean.valueOf(false);
		Boolean c=Boolean.valueOf("Something");
		System.out.println(a+" "+b+" "+c);
		
		Float f1=new Float(34.5666);
		Float f2=new Float("34.6");
		Double d1=new Double(345.6755);
		System.out.println(f1+" "+f2+" "+d1);

	}

}
