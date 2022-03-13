package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//@Component
public class HockeyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Play Hockey By Heart";
	}

}
