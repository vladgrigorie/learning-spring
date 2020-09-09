package udemy.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		
		//load spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//get the bean from spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		
		context.close();
		
	}

}