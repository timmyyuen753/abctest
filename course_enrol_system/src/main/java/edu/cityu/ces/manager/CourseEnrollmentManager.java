package edu.cityu.ces.manager;

import java.util.List;

import edu.cityu.ces.domain.Course;
import edu.cityu.ces.domain.Department;
import edu.cityu.ces.domain.Student;

public interface CourseEnrollmentManager {
	
	//Add Department
	public Department addDepartment(Department department);
	
	//Update Department
	public Department updateDepartment(Department oldDept, Department newDept);
	
	//Delete Department 
	public void deleteDepartment(Department department);
	
	//Find Department by Department ID
	public Department findDepartmentByDepartmentID(String departmentID);
	
	//List all Department in DB
	public List<Department> listAllDepartments();

	//Find Department by Department Name
	public List<Department> findDepartmentByDepartmentName(String departmentName);
	
	//Add Course
	public Course addCourse(Course course);
	
	//Update Course
	public Course updateCourse(Course oldCourse, Course newCourse);
	
	//Delete Course
	public void deleteCourse(Course course);
	
	//Find Course by Course ID
	public Course findCourseByCourseID(String courseID);
	
	//List all Course in DB
	public List<Course> listAllCourses();
	
	//Find Course by Department ID
	public List<Course> findCourseByDepartmentID(String departmentID);
	
	//Find Course by Title
	public List<Course> findCourseByTitle(String title);
	
	//Find Course by Level
	public List<Course> findCourseByLevel(String level);
	
	//Query a
	public List<Course> findCourseByDepartmentIDAndYear(String departmentID, String offerYear);
	
	//Query b
	public List<Course> findCourseByMultipleDepartmentIDAndYear(List<String> departmentIDList, String offerYear);
	
	//Query c
	public List<Course> findMostPopularCourseByOfferYear(String offerYear);
	
	//Query d
	public List<Course> findNumberOfStudentsByDeptIdAndOfferYear(String departmentID, String offerYear);
	
	//Query e
	public List<Course> findCourseByStudentNameEnrollYearDepartmentID(String studentName, String enrollYear, String departmentID);
	
	//Generate Student ID for New Student
	public int generateNewStudentID();
	
	//Add Student
	public Student addStudent(Student student);
	
	//Update Student
	public Student updateStudent(Student oldStudent, Student newStudent);
	
	//Delete Student
	public void deleteStudent(Student student);
	
	//Find Student by Student ID
	public Student findStudentByStudentID(int studentID);
	
	//Find Student by Student Name
	public List<Student> findStudentByStudentName(String studentName);
	
	//Enroll Course
	public void enrollCourse(String courseID, String year, int studentID);
	
	//Drop Course
	public void dropCourse(String courseID, String year, int studentID);
}   