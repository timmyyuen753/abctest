package edu.cityu.ces.manager.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.cityu.ces.SpringMongoConfiguration;
import edu.cityu.ces.domain.Course;
import edu.cityu.ces.domain.Department;
import edu.cityu.ces.domain.Enrolled;
import edu.cityu.ces.domain.Offer;
import edu.cityu.ces.domain.Student;
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
	public void testFindCourseByCourseID() {
		Course course = courseEnrollmentManager.findCourseByCourseID("CS101");
		System.out.println("Course retrieved: " + course.toString());
	}
	
	@Test
	public void testGetAllCourseTitie() {
		List<Course> courseList = courseEnrollmentManager.listAllCourses();
		int i = 0;
		for (Course course : courseList) {
			System.out.println(i + " - Course ID: " + course.getCourseID() + " Course Title: " + course.getTitle());
			i++;
		}
	}
	
	
	@Test
	public void testEnrollCourse() {
		courseEnrollmentManager.enrollCourse("CS201", "2018", 12340009);
	}
	
	@Test
	public void testDropCourse() {
		courseEnrollmentManager.dropCourse("IS101", "2018", 12340008);
	}
	
	@Test
	public void testGenerateNewStudentID() {
		System.out.println("New Student ID: " + courseEnrollmentManager.generateNewStudentID());
	}
	
	@Test
	public void tesListCourseTitleByCS2016() {
		//Query a
		String departmentID = "CS";
		String year = "2016";
		List<Course> courseList = courseEnrollmentManager.findCourseByDepartmentIDAndYear(departmentID, year);
		for (Course course : courseList) {
			System.out.println("Course Title: " + course.getTitle());
		}
	}
	
	@Test
	public void tesFindCourseByCS2016() {
		String departmentID = "CS";
		String year = "2016";
		List<Course> courseList = courseEnrollmentManager.findCourseByDepartmentIDAndYear(departmentID, year);
		for (Course course : courseList) {
			System.out.println("Course: " + course.toString());
			for (Offer offer : course.getOffer()) {
				if (offer.getYear().equalsIgnoreCase(year)) {
					System.out.println("Offer: " + offer.toString());
				}
			}
		}
	}
	
	@Test
	public void tesFindCourseByIS2016() {
		String departmentID = "IS";
		String year = "2016";
		List<Course> courseList = courseEnrollmentManager.findCourseByDepartmentIDAndYear(departmentID, year);
		for (Course course : courseList) {
			System.out.println("Course: " + course.toString());
			for (Offer offer : course.getOffer()) {
				if (offer.getYear().equalsIgnoreCase(year)) {
					System.out.println("Offer: " + offer.toString());
				}
			}
		}
	}
	
	@Test
	public void testFindCourseCSIS2016() {
		//Query b
		List<String> deptIDList = new ArrayList<String>();
		deptIDList.add("CS");
		deptIDList.add("IS");
		String year = "2016";
		List<Course> courseList = courseEnrollmentManager.findCourseByMultipleDepartmentIDAndYear(deptIDList, year);
		for (Course course : courseList) {
			System.out.println("Course: " + course.toString());
			for (Offer offer : course.getOffer()) {
				if (offer.getYear().equalsIgnoreCase(year)) {
					System.out.println("Offer: " + offer.toString());
				}
			}
		}
	}
	
	@Test
	public void tesFindMostPopularCourses2016() {
		//Query c
		String year = "2016";
		List<Course> courseList = courseEnrollmentManager.findMostPopularCourseByOfferYear(year);
		
		for (Course course : courseList) {
			System.out.println("Most Popular Course in 2016: " + course.toString());
		}
	}
	
	@Test
	public void testListNumberOfStudentsCS2016() {
		//Query d
		String departmentID = "CS";
		String year = "2016";
		List<Course> courseList = courseEnrollmentManager.findCourseByDepartmentIDAndYear(departmentID, year);
		for (Course course : courseList) {
			System.out.print("Course: " + course.toString());
			for (Offer offer : course.getOffer()) {
				if (offer.getYear().equalsIgnoreCase(year)) {
					System.out.println(" Number of Enrolled Students: " + offer.getNumOfEnrolStud());
				}
			}
		}
	}
	
	@Test
	public void testFindCourseByStudentNameEnrollYearDepartmentID() {
		//Query e
		String studentName = "CHAN TAI MAN";
		String enrollYear = "2016";
		String departmentID = "CS";
		List<Course> courseList = courseEnrollmentManager.findCourseByStudentNameEnrollYearDepartmentID(studentName, enrollYear, departmentID);
		for (Course course : courseList) {
			System.out.println("Course: " + course.toString());
		}
	}
	
	@Test
	public void testFindNumberOfStudentsByDeptIdAndOfferYear() {
		String departmentID = "IS";
		String year = "2017";
		List<Course> courseList = courseEnrollmentManager.findNumberOfStudentsByDeptIdAndOfferYear(departmentID, year);
		for (Course course: courseList) {
			System.out.println("Course: " + course.toString() + " Number of Enrooled Students: " + course.getOffer().get(0).getNumOfEnrolStud());
		}
	}
}
