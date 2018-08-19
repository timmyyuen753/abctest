package domain;

import org.springframework.data.annotation.Id;

public class Course {
	
	@Id
	private String courseID;
	
	private String title;
	
	private String level;
	
	private Offer offer;
	
	public Course() {}
	
	public Course(String title, String level, Offer offer) {
		this.title = title;
		this.level = level;
		this.offer = offer;
	}
}
