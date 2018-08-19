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
}