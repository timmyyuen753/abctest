package edu.cityu.ces.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Course {
	
	@Id
	private long id;
	
	@Indexed(unique = true)
	private String courseID;
	
	private String deptID;
	
	private String title;
	
	private String level;
	
	private Offer offer;
	
	public Course() {}
	
	public Course(String courseID, String deptID, String title, String level, Offer offer) {
		this.courseID = courseID;
		this.deptID = deptID;
		this.title = title;
		this.level = level;
		this.offer = offer;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
}