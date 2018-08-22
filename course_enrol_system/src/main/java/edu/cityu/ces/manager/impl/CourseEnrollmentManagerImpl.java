package edu.cityu.ces.manager.impl;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.cityu.ces.dao.CourseRepository;
import edu.cityu.ces.dao.DepartmentRepository;
import edu.cityu.ces.dao.StudentRepository;
import edu.cityu.ces.domain.Course;
import edu.cityu.ces.domain.Department;
import edu.cityu.ces.domain.Enrolled;
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
		Department department = departmentRepository.findById(oldDept.getId()).get();
		department.clone(newDept);
		return departmentRepository.save(department);
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
		Course course = courseRepository.findById(oldCourse.getId()).get();
		course.clone(newCourse);
		return courseRepository.save(course);
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
		Student student = studentRepository.findById(oldStudent.getId()).get();
		student.clone(newStudent);
		return studentRepository.save(student);
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
		Student enrolledStudent = studentRepository.findByStudentIdAndEnrolledCourse(studentID, year, courseID);
		
		if (enrolledStudent == null) {
			Course course = courseRepository.findByCourseID(courseID);
			Student student = studentRepository.findByStudentID(studentID);
			if (course == null) {
				System.out.println("The course does not exist!");
			} else if (student == null) {
				System.out.println("The student does not exist!");
			} else {
				int availablePlaces = course.getOffer().getAvailablePlaces();
				int numOfEnrolledStudent = course.getOffer().getNumOfEnrolStud();
				course.getOffer().setAvailablePlaces(availablePlaces - 1);
				course.getOffer().setNumOfEnrolStud(numOfEnrolledStudent + 1);
				
				List<Enrolled> enrolledList = student.getEnrolled();
				enrolledList.add(new Enrolled(year, courseID, new Date()));
				student.setEnrolled(enrolledList);
				
				courseRepository.save(course);
				studentRepository.save(student);
			}
		} else {
			System.out.println("This student is already enrolled in this course!");
		}
	}

	@Override
	public void dropCourse(String courseID, String year, String studentID) {
		Student enrolledStudent = studentRepository.findByStudentIdAndEnrolledCourse(studentID, year, courseID);
		
		if (enrolledStudent != null) {
			Course course = courseRepository.findByCourseID(courseID);
			Student student = studentRepository.findByStudentID(studentID);
			
			int availablePlaces = course.getOffer().getAvailablePlaces();
			int numOfEnrolledStudent = course.getOffer().getNumOfEnrolStud();
			course.getOffer().setAvailablePlaces(availablePlaces + 1);
			course.getOffer().setNumOfEnrolStud(numOfEnrolledStudent - 1);
			
			List<Enrolled> enrolledList = student.getEnrolled();
			for (Iterator<Enrolled> iter = enrolledList.listIterator(); iter.hasNext();) {
				Enrolled enrolled = iter.next();
				if (enrolled.getCourseID().equalsIgnoreCase(courseID) && enrolled.getYear().equalsIgnoreCase(year)) {
					iter.remove();
					break;
				}
			}
			student.setEnrolled(enrolledList);
			
			courseRepository.save(course);
			studentRepository.save(student);
		} else {
			System.out.println("This student is not enrolled in this course!");
		}
	}
}
