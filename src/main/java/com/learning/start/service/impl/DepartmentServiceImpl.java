package com.learning.start.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.start.entity.Department;
import com.learning.start.entity.Employee;
import com.learning.start.repository.DepartmentRepository;
import com.learning.start.repository.EmployeeRepository;
import com.learning.start.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String insertDepartment(Department department) {
		Department dept = new Department();
		dept.setName(department.getName());
		dept.setEmployees(department.getEmployees());
		Department saveDepartment = departmentRepository.save(dept);
		department.getEmployees().forEach(emp -> {
			Employee employee = new Employee();
			employee.setName(emp.getName());
			employee.setDesignation(emp.getDesignation());
			employee.setDepartment(saveDepartment);
			employeeRepository.save(employee);
		});
		return "Details Saved Successfully";
	}

}
