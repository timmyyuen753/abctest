package edu.cityu.ces.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
	
	public Student findByStudentID(String studentID);
	
	public List<Student> findByStudentName(String studentName);
}
