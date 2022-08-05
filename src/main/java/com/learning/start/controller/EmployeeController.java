package com.learning.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.start.entity.Employee;
import com.learning.start.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getEmployees/{name}")
	private List<Employee> getAllEmployeesByDept(@PathVariable String name) {
		return employeeService.getEmployeesByDept(name);
	}

}
