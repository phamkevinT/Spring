package com.kevinpham.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demo of the Setter Injection
 * @author Kevin Pham
 *
 */
public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the bean from spring container
		// We use the CricketCoach class instead of the Coach interface because in this
		// scenario, we need the additional methods of getEmailAddress() and getTeam()
		// that CricketCoach provides. Coach only has getDailyWorkout() and getDailyFortune().
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// Call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		
		
		// Close the context
		context.close();
		
	}

}
