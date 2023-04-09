package com.example.springrest.service;

import java.util.List;
import com.example.springrest.entity.Student;

public interface StudentService {

	// method for saving student details
	Student saveStudent(Student student);

	// method for fetching all student details
	List<Student> getAllStudents();

	//method for get all students by ID
	Student getStudentById(long id);

	// method for updating student details based on customerId
	Student updateStudent(Student student, long id);

	// method for removing Customer detail based on studentId
	void deleteStudent(long id);

}
