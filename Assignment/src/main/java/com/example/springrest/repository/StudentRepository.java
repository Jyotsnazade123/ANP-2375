package com.example.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springrest.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
