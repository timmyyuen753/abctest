package domain;

import java.util.Date;

public class Enrolled {
	
	private String year;
	
	private String courseID;
	
	private Date enrollDate;
	
	public Enrolled() {}
	
	public Enrolled(String year, String courseID, Date enrollDate) {
		this.year = year;
		this.courseID = courseID;
		this.enrollDate = enrollDate;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
}