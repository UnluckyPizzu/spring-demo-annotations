package com.pizzu.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class AverageFortuneService implements FortuneService {

	String[] randomFortune = {"Your Lucky day, my man!", "Today is the day you die, boi"};
	
	private Random rng = new Random();
	
	@Override
	public String getFortune() {
		return randomFortune[rng.nextInt(2)];
	}

}
