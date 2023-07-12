package com.employee.dao;

import java.util.List;

import com.employee.entities.Employee;

public interface EmployeeDao {
	
	 int insertEmp(Employee e);
	 int deleteEmp(int id);
	 int updateEmp(Employee e);
	 Employee getEmployeeById(int id);
	 List<Employee> getAllEmployee();

}
