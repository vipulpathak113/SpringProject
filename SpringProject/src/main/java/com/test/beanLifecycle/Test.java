package com.test.beanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.constructorInjection.Person;

public class Test {

	public static void main(String[] args) {
	
		
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/test/beanLifecycle/config.xml");
	
	System.out.println("------------------------------usingXML");
	UsingXML usingXML = (UsingXML) context.getBean("car");
	System.out.println(usingXML);
	
	System.out.println("------------------------------usingInterface");
	UsingInterface usingInterface = (UsingInterface) context.getBean("interfc");
	System.out.println(usingInterface);
	
	System.out.println("------------------------------usingAnnotation");
	UsingAnnotation usingAnnotation = (UsingAnnotation) context.getBean("annot");
	System.out.println(usingAnnotation);
	
	context.registerShutdownHook();

	}

}
