package com.pizzu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring conf file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		
		Coach coach = context.getBean("lolCoach", Coach.class);
		Coach alphaCoach = context.getBean("lolCoach", Coach.class);
		
		
		//check if they are the same
		
		boolean result = (coach == alphaCoach);
		
		System.out.println(result);
		
		System.out.println("Memory of coach " + coach + ", Memory of alphaCoach " + alphaCoach);
		
		context.close();
		

	}

}
