package com.jsp.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeASD extends Thread implements Functions 
{
	public ArrayList<Employee> al = new ArrayList<Employee>();
	boolean notFoundEmpId = true;
	Scanner sc = new Scanner(System.in);

	@Override
	public void add(Employee e)
	{
		al.add(e);	
		System.out.println("\t\t\t\t Total number of employess : "+al.size());
	}
	@Override
	public void search(int empId)
	{
		int i = 0;
		Integer search = empId;
		while(i<al.size())
		{
			Employee e = (Employee)al.get(i);
			if(search.equals(e.hashCode()))
			{
				System.out.println(e.toString());
				notFoundEmpId = false;
				break;
			}
			i++;
		}
		if(notFoundEmpId)
		{
			throw new EmployeeNotFound();
		}
	}
	@Override
	public void display()
	{
		Iterator<Employee> it=al.iterator();
		if(it.hasNext())
		{
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		else
		{
			System.out.println("\n  Not Data Available To display\n ");
		}
	}
}
