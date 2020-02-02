package com.jsp.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Feedback 
{
	public static void main(String[] args) 
	{
		String url = "jdbc:mysql://localhost:3360?user=root&password=Saiteja2@";
		
		String query = " into test.feedback values('Hari','krishna','krishna2@gmail.com','good')";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			
			System.out.println("Step1");
			
			Statement statement = connection.createStatement();
			
			System.out.println("Step2");
			
			statement.executeUpdate(query);
			
			System.out.println("Step3");
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}
}
