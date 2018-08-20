package edu.cityu.ces.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {
	
	Department findByDeptID(String deptID);
	
	Department findByDeptName(String deptName);
}