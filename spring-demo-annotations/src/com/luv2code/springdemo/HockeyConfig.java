package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan
@PropertySource("classpath:sport.properties")
public class HockeyConfig {
	
	@Bean
	public FortuneService hockeyFortuneService() 
	{
		return new HockeyFortuneService();
	}
	@Bean
	public Coach hockeyCoach()
	{
		return new HockeyCoach(hockeyFortuneService());
	}

}
