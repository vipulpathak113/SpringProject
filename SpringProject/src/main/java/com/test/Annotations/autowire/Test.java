package com.test.Annotations.autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/test/Annotations/autowire/config.xml");

		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		context.registerShutdownHook();

	}

}
