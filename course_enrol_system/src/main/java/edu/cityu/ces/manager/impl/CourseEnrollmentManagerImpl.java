package edu.cityu.ces.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cityu.ces.dao.CourseRepository;
import edu.cityu.ces.dao.DepartmentRepository;
import edu.cityu.ces.dao.StudentRepository;
import edu.cityu.ces.domain.Course;
import edu.cityu.ces.domain.Department;
import edu.cityu.ces.domain.Student;
import edu.cityu.ces.manager.CourseEnrollmentManager;

public class CourseEnrollmentManagerImpl implements CourseEnrollmentManager {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Department addDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public Department updateDepartment(Department oldDept, Department newDept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartment(Department department) {

		departmentRepository.delete(department);
	}

	@Override
	public Department findDepartmentByDepartmentID(String departmentID) {
		
		return departmentRepository.findByDeptID(departmentID);
	}

	@Override
	public List<Department> findDepartmentByDepartmentName(String departmentName) {
		
		return departmentRepository.findByDeptName(departmentName);
	}

	@Override
	public Course addCourse(Course course) {
		
		return courseRepository.save(course);
	}

	@Override
	public Course updateCourse(Course oldCourse, Course newCourse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCourse(Course course) {

		courseRepository.delete(course);
	}

	@Override
	public Course findCourseByCourseID(String courseID) {
		
		return courseRepository.findByCourseID(courseID);
	}

	@Override
	public List<Course> findCourseByDepartmentID(String departmentID) {
		
		return courseRepository.findByDeptID(departmentID);
	}

	@Override
	public List<Course> findCourseByTitle(String title) {
		
		return courseRepository.findByTitle(title);
	}

	@Override
	public List<Course> findCourseByLevel(String level) {
		
		return courseRepository.findByLevel(level);
	}

	@Override
	public Student addStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student oldStudent, Student newStudent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(Student student) {
		
		studentRepository.delete(student);
	}

	@Override
	public Student findStudentByStudentID(String studentID) {
		
		return studentRepository.findByStudentID(studentID);
	}

	@Override
	public List<Student> findStudentByStudentName(String studentName) {
		
		return studentRepository.findByStudentName(studentName);
	}

	@Override
	public void enrollCourse(String courseID, String year, String studentID) {
		Course course = courseRepository.findByCourseID(courseID);
		Student student = studentRepository.findByStudentID(studentID);
	}
}
