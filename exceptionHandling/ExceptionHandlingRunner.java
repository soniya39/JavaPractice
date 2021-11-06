package com.exceptionHandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended");
		
	
	}

	private static void method1() {
		try {
		int[] num = {1,2};
		int i = num[3];
		String str = null;
		str.length();
		System.out.println("Exception Handled");
		}catch(NullPointerException ex) {
			System.out.println("NullPointerException Hnadled");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException Hnadled");
		}
		catch(Exception ex) {
			ex.printStackTrace();//printStackTrace shows the exception in console
		}finally {
			System.out.println("Hello");
		}
	}

}
