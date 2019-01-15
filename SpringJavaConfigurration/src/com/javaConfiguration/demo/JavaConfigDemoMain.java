package com.javaConfiguration.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoMain {
	
	@Value("${property1.email}")
	public String email;
	
	@Value("${property1.team}")
	public String TeamName;

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Coach coach = context.getBean("swimCoach", Coach.class);
		System.out.println("The Daily routine is :" + coach.getDailyWorkout());
		System.out.println("Daily fortune :" +  coach.getDailyFortune());
		context.close();
	}

}
