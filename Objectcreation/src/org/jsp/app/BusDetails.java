package org.jsp.app;

public class BusDetails 
{
	
	private int busSeats;
	private String startingCity;
	private String endingCity;
	private String busColour;
	public int getBusSeats() {
		return busSeats;
	}
	public void setBusSeats(int busSeats) {
		this.busSeats = busSeats;
	}
	public String getStartingCity() {
		return startingCity;
	}
	public void setStartingCity(String startingCity) {
		this.startingCity = startingCity;
	}
	public String getEndingCity() {
		return endingCity;
	}
	public void setEndingCity(String endingCity) {
		this.endingCity = endingCity;
	}
	public String getBusColour() {
		return busColour;
	}
	public void setBusColour(String busColour) {
		this.busColour = busColour;
	}
	@Override
	public String toString() {
		return "BusDetails [busSeats=" + busSeats + ", startingCity=" + startingCity + ", endingCity=" + endingCity
				+ ", busColour=" + busColour + "]";
	}
	

	
	

	
	
	
	
	

}
