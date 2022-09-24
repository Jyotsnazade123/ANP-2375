package org.com.practicaltest.service;

import org.com.practicaltest.DAO.StudentDAO;
import org.com.practicaltest.model.Student;
import org.com.practicaltest.view.StudentView;

public class StudentService {
	static StudentDAO studentDAO=new StudentDAO();
	public void studentdetailService(Student student) {
		StudentService.studentDAO.addStudent(student);
	
	
	
}
	
}
