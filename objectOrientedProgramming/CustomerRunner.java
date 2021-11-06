package com.objectOrientedProgramming;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress =new Address("Mainroad","Haripuram","Srikakulam","532243","AP");
		Address workAddress =new Address("Mainroad","Palasa","Srikakulam","532243","AP");
		Customer customer1 = new Customer("Soniya",homeAddress,workAddress);
		System.out.println(customer1);
		
		customer1.setHomeAddress(workAddress);
		System.out.println(customer1);
		

	}

}
