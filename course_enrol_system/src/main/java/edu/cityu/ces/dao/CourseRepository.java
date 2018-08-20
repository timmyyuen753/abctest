package edu.cityu.ces.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Course;

public interface CourseRepository extends MongoRepository<Course, Long> {
	
	Course findByCourseId(String courseID);
	
	Course findByDepartmentId(String deptID);
	
	Course findByTitle(String title);
	
	Course findByLevel(String level);
}
