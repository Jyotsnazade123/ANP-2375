package com.springjdbc.example.dao;

import com.springjdbc.example.entity.Student;

public interface StudentDao {

	
	public int saveStudent(Student s);

	public int updateStudent(Student s);

	public int deleteStudent(Student s);
}
