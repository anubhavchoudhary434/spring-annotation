package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimCoachDemoApp {

	public static void main(String[] args) {
		// read spring config file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// get the bean from spring container
				
				SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
				
				// call a method on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				// call method to get the injected daily fortune
				System.out.println(theCoach.getDailyFortune());
				
				System.out.println(theCoach.getEmail());
				System.out.println(theCoach.getTeam());
				// close the context
				context.close();

	}

}
