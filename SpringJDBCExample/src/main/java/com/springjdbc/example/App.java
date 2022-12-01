package com.springjdbc.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.springjdbc.example.daoimpl.StudentDaoImpl;
import com.springjdbc.example.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("resource")
	public static void main( String[] args ) {
    	ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
    StudentDaoImpl edaoi = (StudentDaoImpl) ct.getBean("edao");
    
//    int status = edaoi.saveStudent(new Student(103, "Mamta", "101"));
//    System.out.println(status);
//      
//    int status = edaoi.updateStudent(new Student(103, "Mamta", "55000"));
//    System.out.println(status);
    
    Student s= new Student();
    s.setId(103);
    int status=edaoi.deleteStudent(s);
    System.out.println(status);
}
}


