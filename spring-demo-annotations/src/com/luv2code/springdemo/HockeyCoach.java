package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class HockeyCoach implements Coach {

//	@Autowired
//	@Qualifier("hockeyFortuneService")
	private FortuneService theFortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
//	public HockeyCoach()
//	{
//		System.out.println("default");
//	}
//	@Autowired
//	public HockeyCoach(@Qualifier("hockeyFortuneService") FortuneService fortuneService)
//	{
//		this.theFortuneService = fortuneService;
//	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public HockeyCoach(FortuneService hockeyFortuneService) {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public void setTheFortService(@Qualifier("hockeyFortuneService") FortuneService fortuneService)
	{
		this.theFortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Hockey for 40 min daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortune();
	}

}
