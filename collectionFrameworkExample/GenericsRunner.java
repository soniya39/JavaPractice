package com.collectionFrameworkExample;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	public static void main(String[] args) {
		MyCustomList<String> list1 = new MyCustomList<>();
		list1.addElement("sony");
		list1.addElement("soniya");
		System.out.println(list1);
		String value = list1.get(0);
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(544);
		list2.addElement(6666);		
		System.out.println(list2);
		Integer number = list2.get(0);
		System.out.println(number);
		
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(56);
		integerList.add(34);
		System.out.println(sumOfList(integerList));
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(56.03);
		doubleList.add(34.89);
		System.out.println(sumOfList(doubleList));
		
		ArrayList<Float> floatList = new ArrayList<>();
		floatList.add(50.03f);
		floatList.add(34.89f);
		System.out.println(sumOfList(floatList));
		
		ArrayList<Number> newList = new ArrayList<>();
		addElementtoList(newList);
		System.out.println(newList);

	}
	//Upper Bound - wildCard
	static Number sumOfList(List<? extends Number> numbers) {
		Double sum = 0.0;
		for(Number number:numbers) {
			sum+=number.doubleValue();
		}
		return sum;
	}
	//Lower Bound - wildCard
	static void addElementtoList(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.08f);
		numbers.add(1.00000);
		numbers.add(1l);
	}

}
