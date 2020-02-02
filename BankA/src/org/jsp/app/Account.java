package org.jsp.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("a1")
public class Account 
{
	@Value("teja")
	private String accHolderName;
	@Value("954645.67")
	private double amount;
	@Value("Nellore")
	private String location;
	
	@Override
	public String toString() {
		return "Account [accHolderName=" + accHolderName + ", amount=" + amount + ", location=" + location + "]";
	}
	
	

}
