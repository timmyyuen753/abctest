package domain;

import org.springframework.data.annotation.Id;

public class Department {
	
	@Id
	private String deptID;
	
	private String deptName;
	
	private String location;
	
	
    public Department() {}

    public Department(String deptName, String location) {
        this.deptName = deptName;
        this.location = location;
    }

    @Override
    public String toString() {
        return String.format(
                "Department[deptID=%s, deptName='%s', location='%s']",
                deptID, deptName, location);
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