package edu.cityu.ces.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryCustom {
	
	public int getMaxStudentID();
}
