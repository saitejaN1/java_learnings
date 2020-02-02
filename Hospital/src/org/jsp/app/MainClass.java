package org.jsp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args) 
	{
		 ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");
		 Hospital hs =(Hospital) context.getBean("h1");
		 System.out.println(hs);
		
	}

}
