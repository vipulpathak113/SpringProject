package com.jdbc.project;

import java.util.List;

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

		// Insert
//		student.setId(3);
//		student.setName("Sachin Tendulkar");
//		student.setCity("Mumbai");
//
//		int result = studentDao.insert(student);
//		System.out.println("No. of rows inserted " + result);

		// update
//		student.setId(1);
//		student.setName("Ramesh");
//		student.setCity("Delhi");
//
//		int result = studentDao.update(student);
//		System.out.println("No. of rows updated " + result);

		// delete

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Student ID you want to Delete:");
//		int id = sc.nextInt();
//		sc.close();
//		int result = studentDao.delete(id);
//		System.out.println("No. of rows deleted " + result);

		// get single object
//		Student result = studentDao.getStudent(2);
//		System.out.println("No. of rows updated " + result);

		// get multiple objects
		List<Student> students = studentDao.getAllStudents();
		for (Student s : students) {
			System.out.println(s);
		}

	}
}
