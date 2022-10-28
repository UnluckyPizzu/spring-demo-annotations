package com.pizzu.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "no fortune today :C";
	}

}
