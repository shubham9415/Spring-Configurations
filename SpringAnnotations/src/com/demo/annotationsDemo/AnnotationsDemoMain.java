package com.demo.annotationsDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("volleyCoach", Coach.class);
		System.out.println("The Daily routine is :" + coach.getDailyWorkout());
		System.out.println("Daily fortune :" +  coach.getDailyFortune());
		context.close();
	}

}
