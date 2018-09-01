package edu.cityu.ces.dao;

import java.util.List;

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
	
	@Test
	public void testMaxNumOfEnrolledStudents () {
		String year = "2016";
		System.out.println("Max Number of Enrolled Students: " + repository.getMaxNumOfEnrolledStudents(year));
	}
	
	@Test
	public void testFindByOfferYearAndNumOfEnrolStud() {
		String year = "2018";
		int numOfEnrolStud = 70;
		List<Course> courseList = repository.findByOfferYearAndNumOfEnrolStud(year, numOfEnrolStud);
		for (Course course : courseList) {
			System.out.println("Popular Course: " + course.toString());
		}
	}
}
