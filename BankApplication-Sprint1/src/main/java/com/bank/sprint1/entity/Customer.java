package com.bank.sprint1.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//importing all the annotation from lombok for getter,setter and constructor
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer_Information") // creates table in database

public class Customer {

	// instance variable for customer entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;

	// creating columns for table customer
	@Column(length = 20, nullable = false)
	@NotBlank(message = "Enter your first name")
	private String firstName;

	@Column(length = 20, nullable = false)
	@NotBlank(message = "Enter your last name")
	private String lastName;

	@Column(length = 12, nullable = false)
	@NotNull(message = "Enter your addhar no.")
	private double customerAddharNo;

	@Column(length = 10, nullable = false)
	@NotNull(message = "Enter your account no. ")
	private long customerAccountNo;

	@Column(length = 50, nullable = false)
	@NotBlank(message = "Enter your cureent address ")
	private String customerAddress;

	@Column(length = 10, nullable = false)
	@NotNull(message = "Enter your mobile no.")
	private long customerPhone;

	// this stores Transaction entity using one to many mapping relationship
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Transaction> transactionlist;

}
