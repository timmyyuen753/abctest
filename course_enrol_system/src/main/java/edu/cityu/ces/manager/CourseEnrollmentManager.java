package edu.cityu.ces.manager;

import java.util.List;

import edu.cityu.ces.domain.Course;
import edu.cityu.ces.domain.Department;
import edu.cityu.ces.domain.Student;

public interface CourseEnrollmentManager {
	
	public Department addDepartment(Department department);
	
	public Department updateDepartment(Department oldDept, Department newDept);
	
	public void deleteDepartment(Department department);
	
	public Department findDepartmentByDepartmentID(String departmentID);
	
	public List<Department> listAllDepartments();

	public List<Department> findDepartmentByDepartmentName(String departmentName);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course oldCourse, Course newCourse);
	
	public void deleteCourse(Course course);
	
	public Course findCourseByCourseID(String courseID);
	
	public List<Course> listAllCourses();
	
	public List<Course> findCourseByDepartmentID(String departmentID);
	
	public List<Course> findCourseByTitle(String title);
	
	public List<Course> findCourseByLevel(String level);
	
	//Query a
	public List<Course> findCourseByDepartmentIDAndYear(String departmentID, String year);
	
	//Query b
	public List<Course> findCourseByMultipleDepartmentIDAndYear(List<String> departmentIDList, String year);
	
	//Query d
	public List<Course> findNumberOfStudentsByDeptIdAndOfferYear(String deptID, String offerYear);
	
	public int generateNewStudentID();
	
	public Student addStudent(Student student);
	
	public Student updateStudent(Student oldStudent, Student newStudent);
	
	public void deleteStudent(Student student);
	
	public Student findStudentByStudentID(int studentID);
	
	public List<Student> findStudentByStudentName(String studentName);
	
	public void enrollCourse(String courseID, String year, int studentID);
	
	public void dropCourse(String courseID, String year, int studentID);
}   