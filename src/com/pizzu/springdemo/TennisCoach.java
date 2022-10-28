package com.pizzu.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("tennisBoi")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${foo.team}")
	private String team;
	@Value("${foo.email}")
	private String email;
	
	
	public TennisCoach() {
	}

	@Override
	public String getDailyWorkout() {		
		return team + ", We are balling! " + email;
	}

	@Autowired	
	@Qualifier("averageFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
