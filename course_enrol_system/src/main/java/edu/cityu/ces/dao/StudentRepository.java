package edu.cityu.ces.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import edu.cityu.ces.domain.Enrolled;
import edu.cityu.ces.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
	
	public Student findByStudentID(String studentID);
	
	public List<Student> findByStudentName(String studentName);
	
	@Query("{studentID: $0, enrolled: {year: ?1, courseID: ?2}}")
	public List<Enrolled> findEnrolledCourse(String studentID, String year, String courseID);
}
