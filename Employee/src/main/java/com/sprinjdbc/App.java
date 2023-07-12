package com.sprinjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.employee.dao.EmployeeDao;
import com.employee.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context  = new ClassPathXmlApplicationContext("com/sprinjdbc/config.xml");
    	EmployeeDao empDao = context.getBean("empDao", EmployeeDao.class);
    	
    	
    	
		
		 /* Employee ee = new Employee(); ee.setId(7); 
		  ee.setName("Himanshu");
		  ee.setCity("Gujrat");
		 
    	
    	// insert employee
    	empDao.insertEmp(ee); */
    	
    	// delete Employee
    	empDao.deleteEmp(6);
    	
    	// update Employee 
    	Employee e2 = new Employee();
    	e2.setId(5);
    	e2.setName("Som");
    	e2.setCity("Narela");
    	
    	empDao.updateEmp(e2);
    	// get 2 employee
    	Employee e1 = empDao.getEmployeeById(2);
    	System.out.println("Employee ::"+ e1);
    	
    	// Fetch all employee
    	List<Employee> eList = empDao.getAllEmployee();
    	
    	System.out.println(eList);
    	
    	
    	
        
    }
}
