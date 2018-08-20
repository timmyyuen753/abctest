package edu.cityu.ces.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.cityu.ces.domain.Student;

public interface StudentRepository extends MongoRepository<Student, Long> {
	
	Student findByStudentId(String studentID);
	
	Student findByStudentName(String stuName);
}
