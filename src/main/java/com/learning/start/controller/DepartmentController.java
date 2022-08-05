package com.learning.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.start.entity.Department;
import com.learning.start.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/departments/add")
	private String addDepartmentDetails(@RequestBody Department department) {
		return departmentService.insertDepartment(department);
	}

}
