package com.learning.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.start.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	public Department findByName(String name);

}
