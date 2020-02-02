package com.jsp.app;

public class EmployeeNotFound extends RuntimeException
{
		@Override
		public String toString() 
		{
			return "Employee Id not Found";
		}
}
