package edu.cityu.ces.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;


import edu.cityu.ces.dao.StudentRepositoryCustom;
import edu.cityu.ces.domain.Student;

public class StudentRepositoryImpl implements StudentRepositoryCustom {
	
    @Autowired
    private MongoTemplate mongoTemplate;

	@Override
	public int getMaxStudentID() {
		final Query query = new Query()
                .limit(1)
                .with(new Sort(Sort.Direction.DESC, "studentID"));

		Student student = mongoTemplate.findOne(query, Student.class);
        return student.getStudentID();
	}

}
