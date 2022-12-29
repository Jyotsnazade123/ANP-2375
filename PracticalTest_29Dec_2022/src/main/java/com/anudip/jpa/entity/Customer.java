package com.anudip.jpa.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CustomerInfo")

//First Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(length = 30,nullable = false)
	@NotBlank(message = "Enter your name")
	private String cName;
	
	@Column(length = 30,nullable = false)
	@NotBlank(message = "Enter your name")
	private String cSurname;
	
	@Column(length = 30,nullable = false)
	@NotBlank(message = "Enter your surname")
	private String cEmail;
	
	@Column(length = 30,nullable = false, unique = true)
	@NotNull(message = "Enter your phone number")
	private long phone;
}
