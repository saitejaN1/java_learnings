package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailClass 
{
	
		 public static void main(String[] args) 
	     {
	    	 ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
	    	 Bank bn = (Bank) context.getBean("b1");
	    	 System.out.println(bn);
		
	
}
}
