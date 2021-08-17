package com.test.beanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.constructorInjection.Person;

public class Test {

	public static void main(String[] args) {
	
		
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/test/beanLifecycle/config.xml");
	
	Car car = (Car) context.getBean("car");
	
	System.out.println(car);
	
	context.registerShutdownHook();

	}

}
