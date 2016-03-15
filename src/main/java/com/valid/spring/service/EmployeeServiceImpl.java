package com.valid.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valid.spring.dao.EmployeeDAO;
import com.valid.spring.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO empDAO;

	@Override
	public void saveEmployee(Employee employee) {
		empDAO.saveEmployee(employee);
	}

}
