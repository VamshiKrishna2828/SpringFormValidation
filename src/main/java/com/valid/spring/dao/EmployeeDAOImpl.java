package com.valid.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.valid.spring.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private SessionFactory factory;

	@Override
	public void saveEmployee(Employee employee) {
		System.out.println("***********"+factory+"****************");
		factory.getCurrentSession().save(employee);
	}

}
