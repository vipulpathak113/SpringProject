package com.test.annotation.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/test/annotation/stereotype/config.xml");

		Student student = context.getBean("test", Student.class);
		System.out.println(student);

		context.registerShutdownHook();

	}

}