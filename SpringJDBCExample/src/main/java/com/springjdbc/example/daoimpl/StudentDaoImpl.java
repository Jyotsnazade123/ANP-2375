package com.springjdbc.example.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.example.dao.StudentDao;
import com.springjdbc.example.entity.Student;

public class StudentDaoImpl implements StudentDao {

	// jdbctemplate object
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;

	}

	@Override
	public int saveStudent(Student s) {
String query = "insert into stud values('"+ s.getId() +"','"+ s.getName()+"','"+s.getRollno()+"')";
		
		
		return jdbcTemplate.update(query);
	}

	@Override
	public int updateStudent(Student s) {
		String query = "update stud set sname = '"+s.getName()+"' , srollno = '"+s.getRollno()+"' where id = '"+s.getId()+"' ";
		return jdbcTemplate.update(query);
	}

	@Override
	public int deleteStudent(Student s) {
		String query = "delete from stud  where id='"+s.getId()+"'";
		return jdbcTemplate.update(query);
	}
}