package edu.cityu.ces.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import edu.cityu.ces.dao.DepartmentRepository;
import edu.cityu.ces.domain.Department;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ComponentScan("edu.cityu.ces.dao")
public class TestDepartmentRepository {
	
	
	private DepartmentRepository repository;

	@Test
	public void testFindByDepartmentId() {
		Department department = repository.findByDepartmentId("CS");
		
		System.out.println("Department = " + department.toString());
	}

	@Autowired
	public void setRepository(DepartmentRepository repository) {
		this.repository = repository;
	}
}
