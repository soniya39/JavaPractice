package com.collectionFrameworkExample;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;



public class ListSetExamples {

	public static void main(String[] args) {
		
		  List < String > list1 = new ArrayList<String>();
		  list1.add("Banana");
		  list1.add("Apple");
		  List < String > list2 = new ArrayList<String>();
		  list2.add("Goova");
		  list2.add("Mango");
		  List < String > mergeList = new ArrayList<String>();
		  List < String > list3 = new LinkedList<String>(list1);
		  List < String > list4 = new Vector<String>(list1);
		  mergeList.addAll(list1);
		  mergeList.addAll(list2);
		  mergeList.addAll(list3);
		  mergeList.addAll(list4);
		  System.out.println(mergeList);
		  for(String fruit:mergeList) {
			  System.out.println(fruit);
		  }
		  Iterator fruitsIterator = mergeList.iterator();
		  while(fruitsIterator.hasNext()) {
			  System.out.println(fruitsIterator.next());
		  }
		  Set <String> set1 = new HashSet<String>();
		  set1.add("sony");
		  set1.add("Soniya");
		  set1.add("SOnu");
		  System.out.println(set1);
		  Set <Integer> numberset1 = new HashSet<Integer>();
		  numberset1.add(5688);
		  numberset1.add(88);
		  numberset1.add(568);
		  numberset1.add(56);
		  numberset1.add(5);
		  System.out.println(numberset1);
		  Set <Integer> numberset2 = new LinkedHashSet<Integer>();
		  numberset2.add(5688);
		  numberset2.add(88);
		  numberset2.add(568);
		  numberset2.add(56);
		  numberset2.add(5);
		  System.out.println(numberset2);
		  Set <Integer> numberset3 = new TreeSet<Integer>();
		  numberset3.add(5688);
		  numberset3.add(88);
		  numberset3.add(568);
		  numberset3.add(56);
		  numberset3.add(5);
		  System.out.println(numberset3);
	
		  System.out.println(((TreeSet<Integer>) numberset3).floor(56));////gives one number lessthan or equlas the 56
		  System.out.println(((TreeSet<Integer>) numberset3).lower(56));//gives one number lessthan the 56
		  System.out.println(((TreeSet<Integer>) numberset3).ceiling(56));//gives one number graterhanor equlas the 56
		  System.out.println(((TreeSet<Integer>) numberset3).higher(56));//gives one number graterhan the 56
		  System.out.println(((TreeSet<Integer>) numberset3).subSet(5,88));//gives number b/w grater than equals to 5 and lesthan 88
		  System.out.println(((TreeSet<Integer>) numberset3).subSet(5,true,88,true));//includes both lower and upper limit
		  System.out.println(((TreeSet<Integer>) numberset3).subSet(5,false,88,false));//excludes both lower and upper limit
		  System.out.println(((TreeSet<Integer>) numberset3).headSet(568));//it will gives all the number below 568
		  System.out.println(((TreeSet<Integer>) numberset3).tailSet(568));//it will gives all the number above and equlas to  568
				  

	}

}
