package com.practice.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/springcore/ref/refConfig.xml");
		A a =(A) context.getBean("A");
		System.out.println(a);

	}

}
