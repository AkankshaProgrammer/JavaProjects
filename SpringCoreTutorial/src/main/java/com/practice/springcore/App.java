package com.practice.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.springcoreCollections.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) context.getBean("student");
        Student studnt2 = (Student) context.getBean("student1");
        Student student3 = (Student) context.getBean("student2");
        System.out.println(student);
        System.out.println(studnt2);
        System.out.println(student3);
        
        
       ApplicationContext context2 = new ClassPathXmlApplicationContext("CollectionsConfig.xml");
       
       Employee emp = (Employee) context2.getBean("employee1");
       System.out.println(emp);
    }
}
