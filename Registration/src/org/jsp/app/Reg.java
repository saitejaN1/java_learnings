package org.jsp.app;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Reg extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
	      String string = req.getParameter("nm");
	      String string1 = req.getParameter("gd");
	      String string2 = req.getParameter("pn");
	      String string3 = req.getParameter("mail");
	      String string4 = req.getParameter("ps");
	      String string5 = req.getParameter("cp");
		
	}
 
 
 

}