package org.jsp.app;

public class Bus 
{
	
	private int busNumber;
	private String busDriverName;
	private BusDetails details;
	
	public String getBusDriverName()
	{
		return busDriverName;
	}
	public void setBusDriverName(String busDriverName) 
	{
		this.busDriverName = busDriverName;
	}
	public BusDetails getDetails()
	{
		return details;
	}
	public void setDetails(BusDetails details)
	{
		this.details = details;
	}
	public Bus(int busNumber) 
	{
		super();
		this.busNumber = busNumber;
	}
	
	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", busDriverName=" + busDriverName + ", details=" + details + "]";
	}
	
	
	
	
	
	
	


}
