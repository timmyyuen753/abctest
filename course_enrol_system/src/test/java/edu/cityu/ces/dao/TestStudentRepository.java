package edu.cityu.ces.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.cityu.ces.SpringMongoConfiguration;
import edu.cityu.ces.domain.Student;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={SpringMongoConfiguration.class})
public class TestStudentRepository {
	
	@Autowired
	StudentRepository repository;
	
	@Test
	public void testFindByStudentId() {
		Student student = repository.findByStudentID("12340008");
		
		System.out.println("Student = " + student.toString());
	}
}
