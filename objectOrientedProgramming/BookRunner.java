package com.objectOrientedProgramming;

public class BookRunner {

	public static void main(String[] args) {
		
		Book book = new Book("1ABC","JAVAProgramming","Soniya");
		book.addReview(new Review("2SA","Great Book",5));
		book.addReview(new Review("2SB","Awesome Book",5));
		System.out.println(book);
	

	}

}
