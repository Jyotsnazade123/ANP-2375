package com.example.springrest.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//importing all the annotation  for getter,setter and constructor
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student_details") // creates table in database
public class Student {

	// instance variable for student entity
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 3)
	private long sId;

	// creating columns for table student
	@Column(length = 30, nullable = false)
	private String sname;

	@Column(length = 2, nullable = false)
	private int sage;

	@Column(length = 10, nullable = false, unique = true)
	private long sphone;

	@Column(length = 11, nullable = false)
	private String sedu;

	@Column(length = 30, nullable = false, unique = true)
	private String semail;
}
