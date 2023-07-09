package com.springcore.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.dao.StudentDao;
import com.springdao.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
        
        
        //String query = "insert into student(id,name,city) values(?,?,?)";
        
        //template.update(query,1,"Ajay","New Delhi");
        
        Student student = new Student();
        student.setId(2);
        student.setName("john");
        student.setCity("Najafgarh");
        
       int result = studentDao.insert(student);
       
       System.out.println("Student Added "+result);
    }
}