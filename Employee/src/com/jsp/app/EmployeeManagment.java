package com.jsp.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeManagment 
{
	Scanner sc = new Scanner(System.in);
	EmpValidation ev = new EmpValidation();
	Functions f = HelperClass.getFunctionObject();
	EmployeeASD e = new EmployeeASD();
	
	public void options()
	{
		int choose;
		System.out.println("\n\t ===== Welcome to Employee Management System =====   \n");
		do
		{
			access();
			System.out.println("0.press to continue");
			System.out.println("1.press to stop");
			System.out.println("choose : ");
			choose = sc.nextInt();
		}while(!(choose == 1));
		System.out.println("\n   Thanks you!!!");
	}
	
	public void access()
	{
		Employee e = null;
		int empId;
		String empName;
		String empAddress;
		long empphoneNumber;
		int empAge;
		double empSalary;
		boolean check;

		System.out.println("1.TO Add Employee Details");
		System.out.println("2.TO Search Employee");
		System.out.println("3.To Display All Employees Details");
		System.out.println("Choose option : ");
		int option = sc.nextInt();
		switch(option)
		{
			case 1:
				System.out.println("Enter Employee Id : ");
				empId = sc.nextInt();
				
				do
				{
					System.out.println("Enter Employee Name : ");
					empName = sc.next();
					check = ev.empNameValidation(empName);
				}while(!check);
				
				do 
				{
					System.out.println("Enter Employee Age : ");
					empAge = sc.nextInt();
					check = ev.empAgeValidation(empAge);
				} while (!check);
					
				System.out.println("Enter Employee Salary : ");
				empSalary = sc.nextDouble();
				           
				do 
				{
					System.out.println("Enter Employee Phone Number : ");
					empphoneNumber = sc.nextLong();
					check = ev.empPhoneNumberValidation(empphoneNumber);
				} while (!check);
				
				do 
				{
					System.out.println("Enter Employee Address : ");
					empAddress = sc.next();
					check = ev.empAddressValidation(empAddress);
				} while (!check);
				
				f.add(new Employee(empId, empName, empAge, empSalary, empphoneNumber, empAddress));
				System.out.println("successfully added");
				
				break;
				
			case 2:
					System.out.println("Enter Id to Search employee : ");
					int id = sc.nextInt();
					f.search(id);
				break;
				
			case 3:
					f.display();
				break;
				
			default:
				System.out.println("\n\t !!!Wrong Option \n");
				access();
				break;
		}
	}
}
