package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")  //if u donot give explicit bean id here then it will take default bean id tennisCoach
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired  //Direct Field Injection using Reflection
	//@Qualifier("happyFortuneService")  //bcz multiple impl of fortuneservice interface is present
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor-just for diagnostic messages
	public TennisCoach()
	{
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
//	// DI can be done at any method by using @Autowired-Method Injection
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService thefoFortuneService)
//	{
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff");
//		this.fortuneService = thefoFortuneService;
//	}
	
	
//	// define a setter method-Setter Injection
//	@Autowired
//	public void setFortuneService(FortuneService thefoFortuneService)
//	{
//		System.out.println(">> TennisCoach: inside setFortuneService");
//		this.fortuneService = thefoFortuneService;
//	}
	
	
//	// constructor DI with annotation-COnstructor Injection
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService)
//	{
//		this.fortuneService = theFortuneService;
//	}
	
	// define my init method
	
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("TennisCOach: postConstruct");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpMethod()
	{
		System.out.println("TennisCoach: predestroy");
	}

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
	}

}
