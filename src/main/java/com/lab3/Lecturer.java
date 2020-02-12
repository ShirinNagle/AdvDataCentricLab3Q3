package com.lab3;

public class Lecturer {
	
	String firstname;
	String surname;
	String id;
	public Lecturer(String firstname, String surname, String id) {
		super();
		this.firstname = firstname;
		this.surname = surname;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Lecturer [firstname=" + firstname + ", surname=" + surname + ", id=" + id + "]";
	}

	
}
