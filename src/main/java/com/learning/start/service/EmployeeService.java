package com.learning.start.service;

import java.util.List;

import com.learning.start.entity.Employee;

public interface EmployeeService {

	List<Employee> getEmployeesByDept(String name);

}
