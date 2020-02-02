package org.jsp.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("h1")
public class Hospital 
{
	@Value("orange")
	private String hospitalName;
	@Value("Nellore")
	private String location;
	@Autowired
	private Doctor doctor;
	
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", location=" + location + ", doctor=" + doctor + "]";
	}
	

}
