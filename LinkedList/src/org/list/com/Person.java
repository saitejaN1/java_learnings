package org.list.com;

public class Person 
 {
	private String name;
	private String rollno;
	public Person(String name,String rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	public String getName() {
		return this.name;
	}
	public String toString() {
		return "Name; " + this.name + " Rollno; " + this.rollno; 
	}

}
