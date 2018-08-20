package edu.cityu.ces.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Course;

public interface CourseRepository extends MongoRepository<Course, String> {
	
	Course findByCourseID(String courseID);
	
	Course findByDeptID(String deptID);
	
	Course findByTitle(String title);
	
	Course findByLevel(String level);
}
