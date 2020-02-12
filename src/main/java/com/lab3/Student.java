package com.lab3;

public class Student {
	
	String firstname;
	String surname;
	Course course;
	public Student(String firstname, String surname, Course course) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", surname=" + surname + ", course=" + course + "]";
	}
	
	

}
