package com.springcore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sprincore.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student stu = (Student) context.getBean("Student");
        Student stu2 = (Student) context.getBean("Student2");
        System.out.println(stu);
        System.out.println(stu2);
        Student stu3 = (Student) context.getBean("Student3");
        System.out.println(stu3);
    }
}
