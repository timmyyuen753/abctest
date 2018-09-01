package edu.cityu.ces.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.cityu.ces.domain.Course;

@Repository
public interface CourseRepositoryCustom {
	
	public List<Course> getTotalStudentByDeptIdAndOfferYear(String deptID, String offerYear);
}
