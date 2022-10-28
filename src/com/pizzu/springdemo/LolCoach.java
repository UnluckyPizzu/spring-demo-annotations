package com.pizzu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LolCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {		
		return "Be useless";
	}

	@Autowired
	public LolCoach(@Qualifier("badFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	

}
