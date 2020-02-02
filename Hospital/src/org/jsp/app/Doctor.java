
package org.jsp.app;

public class Doctor 
{
	private String doctorName;
	private String specialization;
	
	public Doctor(String doctorName, String specialization) 
	{
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
	}

	@Override
	public String toString() 
	{
		return "Doctor [doctorName=" + doctorName + ", specialization=" + specialization + "]";
	}
	
	
	

}
