package edu.cityu.ces.dao;

import org.junit.Assert;
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
	private DepartmentRepository repository;

	@Test
	public void testFindByDeptId() {
		Department department = repository.findByDeptID("CS");
		
		System.out.println("Department = " + department.toString());
	}
	
	@Test
	public void testInsertDepartment() {
		Department inDept = new Department("MGT", "Management", "Room 11-200, 11/F Lau Ming Wai Academic Building");
		
		repository.save(inDept);
		
		Department outDept = repository.findByDeptID("MGT");
		
		System.out.println("Department = " + outDept.toString());
	}
	
	@Test
	public void testUpdateDepartment() {
		Department department = repository.findByDeptID("MGT");
		
		department.setLocation("Room 10-100, 10/F Lau Ming Wai Academic Building");
		
		repository.save(department);
		
		Department outDept = repository.findByDeptID("MGT");
		
		System.out.println("Department = " + outDept.toString());
	}
	
	@Test
	public void testDeleteDepartment() {
		Department department = repository.findByDeptID("MGT");
		repository.delete(department);
		
		Department outDept = repository.findByDeptID("MGT");
		
		Assert.assertNull(outDept);
	}
}
