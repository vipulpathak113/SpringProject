package com.test.annotation.stereotype;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/test/annotation/stereotype/config.xml");

		Student student = context.getBean("test", Student.class);
		System.out.println(student);
		System.out.println(student.hashCode());

		Student student1 = context.getBean("test", Student.class);
		System.out.println(student1);
		System.out.println(student1.hashCode());

		context.registerShutdownHook();

		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("2+2");
		System.out.println(expression.getValue());

	}

}
