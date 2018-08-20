package edu.cityu.ces.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.cityu.ces.SpringMongoConfiguration;
import edu.cityu.ces.dao.DepartmentRepository;
import edu.cityu.ces.domain.Department;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={SpringMongoConfiguration.class})
public class TestDepartmentRepository {
	
	@Autowired
	DepartmentRepository repository;

	@Test
	public void testFindByDepartmentId() {
		Department department = repository.findByDeptID("CS");
		
		System.out.println("Department = " + department.toString());
	}
}
