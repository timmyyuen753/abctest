package edu.cityu.ces.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.cityu.ces.SpringMongoConfiguration;
import edu.cityu.ces.domain.Course;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={SpringMongoConfiguration.class})
public class TestCourseRepository {
	
	@Autowired
	CourseRepository repository;

	@Test
	public void testFindByCourseId() {
		Course course = repository.findByCourseID("CS101");
		
		System.out.println("Course = " + course.toString());
	}
}
