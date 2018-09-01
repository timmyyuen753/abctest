package edu.cityu.ces.dao.impl;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import edu.cityu.ces.dao.CourseRepositoryCustom;
import edu.cityu.ces.domain.Course;
import edu.cityu.ces.domain.Offer;

public class CourseRepositoryImpl implements CourseRepositoryCustom {

	private final MongoTemplate mongoTemplate;
	
	@Autowired
	public CourseRepositoryImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	@Override
	public List<Course> getTotalStudentByDeptIdAndOfferYear(String deptID, String offerYear) {
		Query query = new Query();
		
		query.addCriteria(Criteria.where("deptID").is(deptID).andOperator(Criteria.where("offer.year").is(offerYear)));
		query.fields().include("deptID");
		query.fields().include("courseID");
		query.fields().include("title");
		query.fields().include("level");
		query.fields().include("offer.$");
		
		return mongoTemplate.find(query, Course.class);
	}
}