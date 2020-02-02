package org.jsp.app;

public class Hospital 
{
	private String hospitalName;
	private String location;
	private Doctor doctor;
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", location=" + location + ", doctor=" + doctor + "]";
	}
	
	

}
