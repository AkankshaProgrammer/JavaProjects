package com.employee.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.employee.dao.EmployeeDao;
import com.employee.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int insertEmp(Employee e) {
		// TODO Auto-generated method stub
		String query = "insert into employee(id, name, city) values(?,?,?)";
		return this.jdbcTemplate.update(query, e.getId(), e.getName(), e.getCity());
		 
	}

	public int deleteEmp(int id) {
	String query = "delete from employee where id=?";
	return this.jdbcTemplate.update(query, id);
		
	}

	public int updateEmp(Employee e) {
		String query ="update employee set name=?, city=? where id=?";
		int r = this.jdbcTemplate.update(query, e.getName(), e.getCity(), e.getId());
		return 0;
	}

	public Employee getEmployeeById(int id) {
		String query="select * from employee where id=?";
		RowMapper<Employee> mapper = new RowMapperImpl();
		Employee e = this.jdbcTemplate.queryForObject(query, mapper,id);
		
		return e;
	}

	public List<Employee> getAllEmployee() {
		String query = "select * from employee";
		List<Employee> empList = this.jdbcTemplate.query(query, new RowMapperImpl());
		return empList;
	}

}
