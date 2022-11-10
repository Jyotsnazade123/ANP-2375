package com.anudip.onetomany.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;


@Data
@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tid;
	
	@Column(length = 30, nullable = false)
	private String tname;
	
	@Column(length = 30, nullable = false,unique = true)
	private String email;
	
	@Column(length = 30, nullable = false)
	private String subject;
	
	@Column(length = 10, nullable = false)
	private String batchCode;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "tid")
	private List<Learner> learner;
	
	

}


