package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		// check if they are same
		boolean result = theCoach==alphaCoach;
		System.out.println(result);
		
		//memory locations of both coach
		System.out.println(theCoach);
		System.out.println(alphaCoach);
		
		context.close();

	}

}
