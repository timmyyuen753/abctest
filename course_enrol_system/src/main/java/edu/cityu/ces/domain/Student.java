package edu.cityu.ces.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Student {
	
	@Id
	private String id;
	
	@Indexed(unique = true)
	private String studentID;
	
	private String studentName;
	
	private Date dob;
	
	private List<Enrolled> enrolled;
	
	public Student() {}
	
	public Student(String studentID, String studentName, Date dob, List<Enrolled> enrolled) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.dob = dob;
		this.enrolled = enrolled;
	}
	
	public String toString() {
        return String.format(
                "Student[studentID=%s, studentName='%s', dob='%s']",
                studentID, studentName, dob);
    }
	
	public void clone(Student student) {
		this.studentID = student.getStudentID();
		this.studentName = student.getStuName();
		this.dob = student.getDob();
		this.enrolled = student.getEnrolled();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStuName() {
		return studentName;
	}

	public void setStuName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<Enrolled> getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(List<Enrolled> enrolled) {
		this.enrolled = enrolled;
	}
}