package com.jsp.app;

import java.util.regex.Pattern;

public class EmpValidation 
{
	public boolean empNameValidation(String empName)
	{
		boolean match=Pattern.matches("[A-Za-z]+", empName);
		if(match == false)
		{
			System.out.println("\n\t Invalid Name [Alphates only enter] \n");
			return match;
		}
		return match;
	}
	
	public boolean empPhoneNumberValidation(long empPhoneNumber)
	{
		String PhoneNumber = String.valueOf(empPhoneNumber);
		boolean match=Pattern.matches("(0|91)?[6-9][0-9]{9}", PhoneNumber);
		if(match == false)
		{
			System.out.println("\n\t Invalid Phone Number \n");
			return match;
		}
		return match;
	}
	public boolean empAgeValidation(int empAge)
	{
		if((empAge>=18) && (empAge<=30))
		{
			return true;
		}
		else 
		{
			System.out.println("\n\t Invalid Age [18-30 Valid] \n");
			return false;
		}
	}
	public boolean empAddressValidation(String empAddress)
	{
		boolean match = Pattern.matches("[\\w\\S\\D\\W\\d\\s]+", empAddress);
		if(match == false)
		{
			System.out.println("\n\t Invalid Address \n");
			return match;
		}
		return match;
	}
	public boolean empSalaryValidation(double empSalary)
	{
		String empsalary = String.valueOf(empSalary);
		boolean match = Pattern.matches("[0-9]", empsalary);
		if(match == false)
		{
			System.out.println("\n\t Invalid amount \n");
			return match;
		}
		return match;
	}
}
