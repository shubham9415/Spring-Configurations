package com.demo1.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.management.jmx.Trace;

public class MyApplication {

	public static void main(String[] args) {

			ClassPathXmlApplicationContext context =
					new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach coach= context.getBean("myCoach", Coach.class);
			System.out.println("The class is :" +coach.getClass());
			System.out.println("DailyWorkout and Today's Fortune is:" + coach.getDailyWorkouts());
			Coach coach1 = context.getBean("CricketCoach", Coach.class);
			System.out.println("Fortune Service" +  coach1.getFortune());
			System.out.println("Cricket Tricks :" + coach1.getDailyWorkouts());
			context.close();
	}
}