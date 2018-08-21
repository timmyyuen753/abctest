package edu.cityu.ces.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Department;

public interface DepartmentRepository extends MongoRepository<Department, String> {
	
	public Department findByDeptID(String deptID);
	
	public List<Department> findByDeptName(String deptName);
}