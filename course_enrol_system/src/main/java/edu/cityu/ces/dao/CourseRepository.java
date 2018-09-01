package edu.cityu.ces.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.cityu.ces.domain.Course;

public interface CourseRepository extends MongoRepository<Course, String>, CourseRepositoryCustom {
	
	public Course findByCourseID(String courseID);
	
	public List<Course> findByDeptID(String deptID);
	
	public List<Course> findByTitle(String title);
	
	public List<Course> findByLevel(String level);
	
	@Query("{ 'deptID' : ?0, 'offer.year': ?1}")
	public List<Course> findByDeptIdAndOfferYear(String deptID, String offerYear);
}
