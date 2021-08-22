package com.jdbc.project;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.project.dao.StudentDao;
import com.jdbc.project.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/jdbc/project/config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();

		student.setId(2);
		student.setName("Sachin Tendulkar");
		student.setCity("Mumbai");

		int result = studentDao.insert(student);
		System.out.println("No. of rows inserted " + result);

	}
}
