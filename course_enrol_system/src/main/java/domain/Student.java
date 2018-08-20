package domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Student {
	
	@Id
	private String studentID;
	
	private String stuName;
	
	private Date dob;
	
	private Enrolled[] enrolled;
	
	public Student() {}
	
	public Student(String stuName, Date dob, Enrolled[] enrolled) {
		this.stuName = stuName;
		this.dob = dob;
		this.enrolled = enrolled;
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