package edu.cityu.ces.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Department;

public interface DepartmentRepository extends MongoRepository<Department, Long> {
	
	Department findByDepartmentId(String deptID);
	
	Department findByDepartmentName(String deptName);
}