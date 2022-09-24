package org.com.practicaltest.DAO;

import java.util.Scanner;

import org.com.practicaltest.model.Student;
import org.com.practicaltest.service.StudentService;

public class StudentDAO {
	static Student studentArray[]=new Student[10];
	public static boolean addStudent(Student student) {
		boolean result=false;
		
		for(int i=0;i<studentArray.length;i++)
		{
			if(studentArray[i]==null) {
				studentArray[i]=student;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static Student[] displayStudents() {
		return studentArray;
	}
	}

