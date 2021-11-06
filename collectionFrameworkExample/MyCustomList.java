package com.collectionFrameworkExample;

import java.util.ArrayList;

public class MyCustomList<T> {
	
	ArrayList<T> myList = new ArrayList<>();
	
	public void addElement(T element) {
		myList.add(element);
	}
	public void removeElement(T element) {
		myList.remove(element);
	}
	public String toString() {
		return myList.toString();
	}
	public T get(int index) {
		return myList.get(index);
	}

}
