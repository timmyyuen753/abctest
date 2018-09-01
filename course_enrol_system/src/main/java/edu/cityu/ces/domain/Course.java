package edu.cityu.ces.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

public class Course {
	
	@Id
	private String id;
	
	@Indexed(unique = true)
	private String courseID;
	
	private String deptID;
	
	private String title;
	
	private String level;
	
	private List<Offer> offer;
	
	public Course() {}
	
	public Course(String deptID, String courseID, String title, String level, List<Offer> offer) {
                this.deptID = deptID;
		this.courseID = courseID;
		this.title = title;
		this.level = level;
		this.offer = offer;
	}
	
    @Override
    public String toString() {
        return String.format(
                "Course[courseID=%s, deptID='%s', title='%s', level='%s]",
                courseID, deptID, title, level);
    }
    
    public void clone(Course course) {
    	this.courseID = course.getCourseID();
		this.deptID = course.getDeptID();
		this.title = course.getTitle();
		this.level = course.getLevel();
		this.offer = course.getOffer();
    }
    
    public Offer getCurrentYearOffer() {
    	Calendar calendar = Calendar.getInstance();
    	calendar.setTime(new Date());
    	int currentYear = calendar.get(Calendar.YEAR);
    	for (Offer off : this.offer) {
    		if (Integer.parseInt(off.getYear()) == currentYear) {
    			return off;
    		}
    	}
    	
    	return null;
    }
    
    public void updateOffer(Offer updatedOffer) {
    	for (Offer off : this.offer) {
    		if (off.getYear().equalsIgnoreCase(updatedOffer.getYear())) {
    			off = updatedOffer;
    			break;
    		}
    	}
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public List<Offer> getOffer() {
		return offer;
	}

	public void setOffer(List<Offer> offer) {
		this.offer = offer;
	}
}