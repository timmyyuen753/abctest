package edu.cityu.ces.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

public class Department {
	
	@Id
	private long id;
	
	@Indexed(unique = true)
	private String deptID;
	
	private String deptName;
	
	private String location;
	
	
    public Department() {}

    public Department(String deptID, String deptName, String location) {
    	this.deptID = deptID;
        this.deptName = deptName;
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format(
                "Department[deptID=%s, deptName='%s', location='%s']",
                deptID, deptName, location);
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeptID() {
		return deptID;
	}

	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}