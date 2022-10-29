package com.pizzu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LolCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {		
		return "Be useless";
	}
	
	//@PostConstruct
	public void getTiramisu() {
		System.out.println("Gnammy, tiramisu");
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
	
	//@PreConstruct
	public void nowImTired()
	{
		System.out.println("Man, i'm tired, bye bye");
	}

}
