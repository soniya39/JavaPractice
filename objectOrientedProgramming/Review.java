package com.objectOrientedProgramming;

public class Review {
	
	private String id;
	private String description;
	private int rating;
	
	public Review(String id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}
	public String toString() {
		return description+"--"+rating;
				
	}
	
	

}
