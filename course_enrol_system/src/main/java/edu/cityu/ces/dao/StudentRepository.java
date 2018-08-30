package edu.cityu.ces.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.cityu.ces.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String>, StudentRepositoryCustom {
	
	public Student findByStudentID(int studentID);
	
	public List<Student> findByStudentName(String studentName);
	
	@Query("{studentID: ?0, enrolled: {$elemMatch: {year: ?1, courseID: ?2}}}")
	public Student findByStudentIdAndEnrolledCourse(int studentID, String year, String courseID);
}
