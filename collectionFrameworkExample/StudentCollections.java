package com.collectionFrameworkExample;

import java.util.Comparator;

public class StudentCollections implements Comparable<StudentCollections>{
	
	
	private String name;
	private int id;
	
	public StudentCollections(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String toStirng() {
		return name +" "+id;
	}
	
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int compareTo(StudentCollections that) {		
		//return Integer.compare(this.id, that.id);
		return Integer.compare(that.id,this.id);//If we want to reverse the order(Higher to lower)
	}
	
	

}

