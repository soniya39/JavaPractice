package com.exceptionHandling;

class CurrencyUnmatchedException extends Exception{//Custom Exception
	CurrencyUnmatchedException(String msg){
	super(msg);
	}
}
class Amount {
	private String currency;
	private int money;
	
	Amount(String currency,int money){
		this.currency = currency;
		this.money = money;
	}
	/*public int add(Amount that) {
		if(!this.currency.equalsIgnoreCase(that.currency)) {
			throw new RuntimeException("Different Currency");
		}
		return this.money + that.money;
	}*/ //OR below
	public int add(Amount that) throws CurrencyUnmatchedException {
		if(!this.currency.equalsIgnoreCase(that.currency)) {
			throw new CurrencyUnmatchedException("Different Currency");
		}
		return this.money + that.money;
	}
}
public class ThroesExceptionRunner {

	public static void main(String[] args) throws CurrencyUnmatchedException {
		Amount amount1 = new Amount("INR", 12);
		Amount amount2 = new Amount("USD", 12);
		System.out.println(amount1.add(amount2));
		
	
	}

}
