package org.jsp.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("d1")
public class Doctor 
{
	@Value("teja")
	private String doctorName;
	@Value("sex")
	private String specialization;
	
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", specialization=" + specialization + "]";
	}
	
	
		

}
