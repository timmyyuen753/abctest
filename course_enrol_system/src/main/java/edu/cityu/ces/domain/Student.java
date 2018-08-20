package edu.cityu.ces.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Student {
	
	@Id
	private long id;
	
	@Indexed(unique = true)
	private String studentID;
	
	private String stuName;
	
	private Date dob;
	
	private Enrolled[] enrolled;
	
	public Student() {}
	
	public Student(String studentID, String stuName, Date dob, Enrolled[] enrolled) {
		this.studentID = studentID;
		this.stuName = stuName;
		this.dob = dob;
		this.enrolled = enrolled;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Enrolled[] getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(Enrolled[] enrolled) {
		this.enrolled = enrolled;
	}
}