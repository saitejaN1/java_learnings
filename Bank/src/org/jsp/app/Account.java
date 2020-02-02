package org.jsp.app;

public class Account 
{
	private String holderName;
	private double creditedAmount;
	private String accountHolderLocation;
	
	public Account(String holderName, double creditedAmount, String accountHolderLocation) {
		super();
		this.holderName = holderName;
		this.creditedAmount = creditedAmount;
		this.accountHolderLocation = accountHolderLocation;
	}

	@Override
	public String toString() {
		return "Account [holderName=" + holderName + ", creditedAmount=" + creditedAmount + ", accountHolderLocation="
				+ accountHolderLocation + "]";
	}
	
	
	

}
