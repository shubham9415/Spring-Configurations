package com.demo1.intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {

public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("BeanScopeapplicationContext.xml");
	Coach thecoach = context.getBean("myCoach", Coach.class);

	Coach thealphacoach = context.getBean("myCoach", Coach.class);
	
	Boolean boolean1 = (thecoach == thealphacoach);
	System.out.println( "Memory is allocated at the same location: " + boolean1);
	System.out.println("The memory location for thecoach is :" + thecoach);
	System.out.println("The Memory location for the alphacoach: " + thealphacoach);
	
	if (null != context) {
		context.close();	
	}
}
}
