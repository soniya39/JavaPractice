package com.objectOrientedProgramming;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principal;
	private BigDecimal interest;
	
	
	public BigDecimal getPrincipal() {
		return principal;
	}


	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}


	public BigDecimal getInterest() {
		return interest;
	}


	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}


	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
		
	}
	public BigDecimal calculateTotalValue(int noOfYears) {
		BigDecimal totalAmount= principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		return totalAmount;
	}
	

}
