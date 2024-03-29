package udemy.spring.springdemo.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import udemy.spring.springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		// load the spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		Coach anotherCoach = context.getBean("anotherCoach", Coach.class);
		Coach alphaAnotherCoach = context.getBean("anotherCoach", Coach.class);
		
		
		//check if the are the same
		
		// singleton
		
		boolean result = (theCoach == alphaCoach);
		System.out.println("Singleton - Pointing to the same object: " + result);
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach);
		
		//prototype
		
		boolean result2 = (anotherCoach == alphaAnotherCoach);
		System.out.println("Prototype - Pointing to the same object: " + result2);
		System.out.println("Memory location for theCoach: " + anotherCoach);
		System.out.println("Memory location for alphaCoach: " + alphaAnotherCoach);
		
		//Assigment
		
		System.out.println("\nASSIGMENT:\n");
		
		//retrieve bean from spring container
		
		Coach theFitnessCoach = context.getBean("myFitnessCoach", Coach.class);
		Coach alphaFitnessCoach = context.getBean("myFitnessCoach", Coach.class);
		
		Coach anotherFitnessCoach = context.getBean("anotherFitnessCoach", Coach.class);
		Coach alphaAnotherFitnessCoach = context.getBean("anotherFitnessCoach", Coach.class);
		
		
		//check if the are the same
		
		// singleton
		
		boolean result3 = (theCoach == alphaCoach);
		System.out.println("Singleton - Pointing to the same object: " + result3);
		System.out.println("Memory location for theFitnessCoach: " + theFitnessCoach);
		System.out.println("Memory location for alphaFitnessCoach: " + alphaFitnessCoach);
		
		//prototype
		
		boolean result4 = (anotherCoach == alphaAnotherCoach);
		System.out.println("Prototype - Pointing to the same object: " + result4);
		System.out.println("Memory location for anotherFitnessCoach: " + anotherFitnessCoach);
		System.out.println("Memory location for alphaAnotherFitnessCoach: " + alphaAnotherFitnessCoach);
		
		//close context
		
		context.close();
		
	}

}
