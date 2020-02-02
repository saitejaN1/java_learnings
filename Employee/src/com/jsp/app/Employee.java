package com.jsp.app;

public class Employee
{
	private int empId;
	private String empName;
	private int empAge;
	private double empSalary;
	private long empPhoneNumber;
	private String empAddress;
	
	public Employee(int empId,String empName,int empAge,double empSalary,long empPhoneNumber,String empAddress)
	{
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
		this.empPhoneNumber = empPhoneNumber;
		this.empAddress = empAddress;
	}
	
	@Override
	public int hashCode() 
	{
		return this.empId;
	}
	
	@Override
	public String toString() 
	{
		return "\n Employee ID: "+this.empId+"\n Employee Name : "+this.empName+"\n Employee Age : "+this.empAge+"\n Employee Salary : "+this.empSalary+
				"\n Employee PhoneNumber : "+this.empPhoneNumber+"\n Employee Address : "+this.empAddress+"\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		return this.empId == e.empId;
	}
}
