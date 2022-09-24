package org.com.practicaltest.view;

import java.util.Scanner;

import org.com.practicaltest.model.Student;
import org.com.practicaltest.service.StudentService;

public class StudentView {
	
	 static StudentService service=new StudentService();
	 public void addStudent() {
		 Scanner scanner=new Scanner(System.in);
	System.out.println("Student Information -");
	System.out.println("Enter a Student Id :");
	int studentId=scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter a Student Name :");
	String studentName=scanner.nextLine();
	System.out.println("Enter a Student Age :");
	int studentAge=scanner.nextInt();
	scanner.nextLine();
	
	Student studentobj=new Student(studentId,studentName,studentAge );
	
		StudentView.service.studentdetailService(studentobj);
	 }
}