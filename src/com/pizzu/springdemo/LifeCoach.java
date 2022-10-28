package com.pizzu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lifeIsGood")
public class LifeCoach implements Coach {

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	public LifeCoach() {
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Be yourself";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() + " from life";
	}

}
