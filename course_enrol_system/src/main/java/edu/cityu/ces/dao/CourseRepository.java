package edu.cityu.ces.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Course;

public interface CourseRepository extends MongoRepository<Course, String> {
	
	public Course findByCourseID(String courseID);
	
	public List<Course> findByDeptID(String deptID);
	
	public List<Course> findByTitle(String title);
	
	public List<Course> findByLevel(String level);
}
