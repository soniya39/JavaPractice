package com;

import java.math.BigDecimal;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =20;
		short j=(short) i;
		int i1=j;
		float f=32.111f;
		float f1=34.222f;
		double d=456.899;
		f=(float)d;
		d=f;
		int i2=(int)f;
		char ch = '\u00A2'; //Unicode value of cent symbol
		char ch1 = 65; //ch1= A
		char ch2= 'B';
		ch2++; //now ch2= C
		ch2=(char)(ch2+5);//now ch2= H
		BigDecimal bd= new BigDecimal("23.567");
		BigDecimal cd=new BigDecimal("34.6789");
		System.out.println(bd.add(cd));
		System.out.println(bd.add(new BigDecimal(i)));
		System.out.println(f+f1);
		System.out.println(ch+" "+ch1+" "+ch2);
		boolean isEven=(i%2==0?true:false);
		String even=(i%2==0 ? "YES":"NO");
		int evenNo=(i%2==0? 0:1);
		System.out.println(isEven+" "+even+" "+evenNo);
		List exampleList = List.of("Sony",5);
		System.out.println(exampleList);
	}

}
