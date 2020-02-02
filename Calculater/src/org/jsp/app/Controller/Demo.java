package org.jsp.app.Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) 
			throws ServletException, IOException
	{
		String numb1 = req.getParameter("num1");
		String numb2 = req.getParameter("num2");
		
		
	}

}
