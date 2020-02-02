package com.allprg.app;

import java.util.Scanner;

public class Varibles 
{
	public static boolean isprime(int num)
	{
		if(num == 0||num ==1)
		{
			return false;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		boolean res = isprime(sr.nextInt());
		if (res == true)
			System.out.println("it is a prime number");
		else
			System.out.println("not prime number");
	}
}

