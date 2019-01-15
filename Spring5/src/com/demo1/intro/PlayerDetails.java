package com.demo1.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerDetails {

	private static String firstName;
	private static String lastName;
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("First name :" + firstName);
		System.out.println("Last name :" + lastName);
	}
}
