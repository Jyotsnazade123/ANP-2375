package com.example.springrest.servicetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.springrest.entity.Student;
import com.example.springrest.repository.StudentRepository;
import com.example.springrest.service.StudentService;

@SpringBootTest
public class StudentServiceTest {
	@Autowired
	private StudentService studentservice;

	@MockBean
	private StudentRepository studentrepository;

	@Test
	public void testSaveStudent() {
		Student s = new Student();
		s.setSId(1);
		s.setSname("Ram");
		s.setSage(45);
		s.setSedu("B.C.A");
		s.setSemail("ram@gmail.com");

		Mockito.when(studentrepository.save(s)).thenReturn(s);
		assertThat(studentservice.saveStudent(s)).isEqualTo(s);
	}

	// testing getAllstudent() of student service
	@Test
	public void testgetAllPassenger() {
		Student s = new Student();
		s.setSId(1);
		s.setSname("Ram");
		s.setSage(45);
		s.setSedu("B.C.A");
		s.setSemail("ram@gmail.com");

		Student s1 = new Student();
		s.setSId(2);
		s.setSname("Sahil");
		s.setSage(32);
		s.setSedu("B.D.A");
		s.setSemail("sahil@gmail.com");

		Student s2 = new Student();
		s.setSId(3);
		s.setSname("pihu");
		s.setSage(23);
		s.setSedu("B.E");
		s.setSemail("pihu@gmail.com");

		List<Student> al = new ArrayList<Student>();
		al.add(s);
		al.add(s1);
		al.add(s2);
		Mockito.when(studentrepository.findAll()).thenReturn(al);
		assertThat(studentservice.getAllStudents()).isEqualTo(al);
	}

	// testing getByIdStudent() of student service
	@Test
	public void testgetPassengerById() {
		Student s1 = new Student();
		s1.setSId(1);
		s1.setSname("Ram");
		s1.setSage(45);
		s1.setSedu("B.C.A");
		s1.setSemail("ram@gmail.com");

		Optional<Student> a = Optional.of(s1);
		Student ua = a.get();

		Mockito.when(studentrepository.findById((long) 1)).thenReturn(a);
		assertThat(studentservice.getStudentById(1)).isEqualTo(ua);

	}

	// testing updateByIdPassenger() of passenger service
	@Test
	public void testUpdateStudentById() {
		Student s1 = new Student();
		s1.setSId(1);
		s1.setSname("Ram");
		s1.setSage(45);
		s1.setSedu("B.C.A");
		s1.setSemail("ram@gmail.com");

		Optional<Student> a = Optional.of(s1);
		Student ua = a.get();

		Mockito.when(studentrepository.findById((long) 1)).thenReturn(a);

		// updated education
		ua.setSedu("B.S.C");
		Mockito.when(studentrepository.save(ua)).thenReturn(ua);
		assertThat(studentservice.updateStudent(ua, 1)).isEqualTo(ua);
	}

	// testing deleteByIdPassenger() of passenger service
	@Test
	public void testdeleteStudentById() {
		Student s1 = new Student();
		s1.setSId(1);
		s1.setSname("Ram");
		s1.setSage(45);
		s1.setSedu("B.C.A");
		s1.setSemail("ram@gmail.com");

		Optional<Student> a = Optional.of(s1);

		Mockito.when(studentrepository.existsById((long) 1)).thenReturn(false);
		assertThat(studentrepository.existsById(a.get().getSId()));

	}

}
