package com.test.spel;

import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Test {

	public static void main(String[] args) {
		// Create and set a calendar
		GregorianCalendar c = new GregorianCalendar();
		c.set(1856, 7, 9);

		// The constructor arguments are name, birthday, and nationality.
		Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("name");
		EvaluationContext context = new StandardEvaluationContext(tesla);
		String name = (String) exp.getValue(context);
		System.out.println(name);

		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/test/spel/config.xml");
		Employee emp = context1.getBean("employee", Employee.class);
		System.out.println(emp);
	}

}
