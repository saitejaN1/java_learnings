package com.jsp.app;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Registration 
	{
	 public static void main(String[] args)
	 {
		String url = "jdbc:mysql://localhost:3306?user=root&password=Saiteja2@";
		String query = "insert into test.registration values(?,?,?,?)";
		try 
		{
			
			Connection connection = DriverManager.getConnection(url);
			System.out.println("step 1");
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			System.out.println("step 2");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("enter name");
			preparedStatement.setString(1,scanner.next());
			
			System.out.println("enter PhoneNum");
			preparedStatement.setString(2,scanner.next());
			
			System.out.println("enter Email-Id");
			preparedStatement.setString(3,scanner.next());
			
			System.out.println("enter password");
			preparedStatement.setString(4,scanner.next());
			
			preparedStatement.executeUpdate();
			System.out.println("step 3");
		} 
		catch (SQLException e)
		{ 
			
			e.printStackTrace();
		}
	 }
	}

