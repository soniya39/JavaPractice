package com.collectionFrameworkExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IntegerExampleWithArrayList {

	public static void main(String[] args) {
		List<Integer> list1 =new ArrayList<Integer>();
		list1.add(34);
		list1.add(45);
		list1.add(46);
		list1.add(47);
		Iterator list1Iterator = list1.iterator();
		while(list1Iterator.hasNext()){
			System.out.println(list1Iterator.next());
		}
		list1.remove(Integer.valueOf(46));
		list1.remove(2);
		for(int i:list1) {
			System.out.println(i);
		}
		List<Integer> numbers = new ArrayList<>(list1);
		numbers.add(2);
		numbers.add(100);
		System.out.println(numbers.toString());
		Collections.sort(numbers);
		System.out.println(numbers.toString());

	}

}
