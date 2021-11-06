package com.objectOrientedProgramming;

import java.util.ArrayList;

public class Book {
	
	private String id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();
	
	public Book(String id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	} 
	public String toString() {
		return name+"--->"+reviews;
	}
	public void addReview(Review review) {
		this.reviews.add(review);
		
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
