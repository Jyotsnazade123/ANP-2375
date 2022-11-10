package com.anudip.onetomany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Learner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	
	
	
	@Column(length = 30, nullable = false)
	private String sname;
	
	@Column(length = 30, nullable = false)
	private String edu;
	
	@Column(length = 30, nullable = false)
	private String addr;
	
	@Column(length = 11, nullable = false, unique = true)
	private long phone;

	//@ManyToOne(targetEntity = Trainer.class)
	//private Trainer trainer;
}


