package com.lab3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/lab2/beans/beans.xml");
		
		Student s = (Student) context.getBean("studentBean");
		Course c = (Course) context.getBean("courseBean");
		Lecturer l = (Lecturer) context.getBean("lecturerBean");
		
		//Car c1 = (Car) context.getBean("2017-G-1");
		System.out.println(s);
		System.out.println(c);
		System.out.println(l);

	}

}
