package edu.cityu.ces.manager.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.cityu.ces.SpringMongoConfiguration;
import edu.cityu.ces.domain.Department;
import edu.cityu.ces.manager.CourseEnrollmentManager;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={CourseEnrollmentManagerImpl.class})
@ContextConfiguration(classes={SpringMongoConfiguration.class})
public class TestCourseEnrollmentManager {
	
	@Autowired
	private CourseEnrollmentManager courseEnrollmentManager;
	
	@Test
	public void testUpdateDepartment() {
		
		Department oldDepartment = new Department("MGT", "Management", "Room 11-200, 11/F Lau Ming Wai Academic Building");
		oldDepartment = courseEnrollmentManager.addDepartment(oldDepartment);
		System.out.println("Added Department = " + oldDepartment.toString());
		
		Department newDepartment = new Department("MGT", "Management", "Room 10-100, 10/F Lau Ming Wai Academic Building");
		newDepartment = courseEnrollmentManager.updateDepartment(oldDepartment, newDepartment);
		System.out.println("Updated Department = " + newDepartment.toString());
		
		courseEnrollmentManager.deleteDepartment(newDepartment);;
		System.out.println("Deleted Department = " + newDepartment.toString());
	}
	
	@Test
	public void testEnrollCourse() {
		courseEnrollmentManager.enrollCourse("IS101", "2016", "12340008");
	}
	
	@Test
	public void testDropCourse() {
		courseEnrollmentManager.dropCourse("IS101", "2016", "12340008");
	}
}
