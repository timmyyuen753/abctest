package edu.cityu.ces.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.cityu.ces.domain.Course;

@Repository
public interface CourseRepositoryCustom {
	
	public List<Course> findCourseByMultipleDepartmentIDAndYear(List<String> deptIDList, String offerYear);
	
	public List<Course> findCourseByMultipleCourseIDAndDepartmentID(List<String> courseIDList, String departmentID);
	
	public int getMaxNumOfEnrolledStudents(String offerYear);
	
	public List<Course> getTotalStudentByDeptIdAndOfferYear(String deptID, String offerYear);
	
	
}
