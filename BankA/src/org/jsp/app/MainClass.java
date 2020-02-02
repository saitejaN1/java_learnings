package org.jsp.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.jsp.app");
		context.refresh();
		Bank bk = (Bank) context.getBean("b1");
		System.out.println(bk);
		
	}

}
