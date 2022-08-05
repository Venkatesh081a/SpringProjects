package com.learning.start.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.start.entity.Employee;
import com.learning.start.repository.EmployeeRepository;
import com.learning.start.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getEmployeesByDept(String name) {
		return employeeRepository.findByDepartmentName(name);
	}

}
