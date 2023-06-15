package com.practice.springcoreCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/springcoreCollections/CollectionsConfig.xml");
			Employee emp = (Employee) context.getBean("employee1");
			System.out.println(emp);
			

	}

}
