package com.test.Annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.beanLifecycle.UsingAnnotation;
import com.test.beanLifecycle.UsingInterface;
import com.test.beanLifecycle.UsingXML;

public class Test {

	public static void main(String[] args) {
	
		
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/test/Annotations/config.xml");
	
	Student student = context.getBean("student",Student.class);
	System.out.println(student);
	
	context.registerShutdownHook();

	}

}
