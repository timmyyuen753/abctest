package edu.cityu.ces.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
	
	Student findByStudentID(String studentID);
	
	Student findByStudentName(String studentName);
}
