package com.testProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("com/testProject/config.xml");
        
        Student student1= (Student) context.getBean("student1");
        
        System.out.println(student1);
    }
}
