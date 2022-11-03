package com.anudip.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name ="empl_details" )
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "Name cannot be blank")
	@Min(value = 3)
	private String ename;
	
	@Column(length = 30 , nullable = false)
	@NotBlank(message = "employee cannot be blank")
	@Min(value = 3)
	private String addr;
	
	@Column(length = 30 , nullable = false, unique = true)
	@NotBlank(message = "employee cannot be blank")
	@Email(message= "Incorrect email id")
	private String email;
	
	@Column(length = 30 , nullable = false, unique = true)
	@NotBlank(message = "employee cannot be blank")
	private long phone;

	
	
}
	

