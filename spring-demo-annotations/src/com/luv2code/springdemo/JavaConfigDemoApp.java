package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class);  //put default bean id tennisCoach in case no bean id given in @component of class
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get the injected daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();


	}

}
