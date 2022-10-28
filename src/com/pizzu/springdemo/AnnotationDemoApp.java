package com.pizzu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		
		Coach coach = context.getBean("tennisBoi",Coach.class);
		
		// call a method on the bean
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		
		// close the context
		
		context.close();
	}

}
