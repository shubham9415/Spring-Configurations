package com.demo.annotationsDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		Coach coach = context.getBean("volleyCoach", Coach.class);
		System.out.println("The Daily routine is :" + coach.getDailyWorkout());
		System.out.println("Daily fortune :" +  coach.getDailyFortune());
		context.close();
	}

}
