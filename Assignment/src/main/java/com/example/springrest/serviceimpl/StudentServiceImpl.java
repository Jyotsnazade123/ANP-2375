package com.example.springrest.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrest.entity.Student;
import com.example.springrest.exception.ResourceNotFoundException;
import com.example.springrest.repository.StudentRepository;
import com.example.springrest.service.StudentService;

@Service
//implement all my CRUD method, all business logic
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	@Autowired
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));

	}

	@Override
	public Student updateStudent(Student student, long id) {
		// we need to check whether student with given id is exist in DB or not
		Student existingStudent = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

		existingStudent.setSname(student.getSname());
		existingStudent.setSage(student.getSage());
		existingStudent.setSphone(student.getSphone());
		existingStudent.setSedu(student.getSedu());
		existingStudent.setSemail(student.getSemail());
		// save existing student to DB
		studentRepository.save(existingStudent);
		return existingStudent;
	}

	@Override
	public void deleteStudent(long id) {
		// check whether a student exist in a DB or not
		studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "Id", id));
		studentRepository.deleteById(id);

	}

}
