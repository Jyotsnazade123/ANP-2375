package org.com.practicaltest.model;

import java.util.Objects;

public class Student {
	
	public int student;
	public int id;
	public String name;
	public int age;
	
	
	
	public Student(int student, int id, String name, int age) {
		super();
		this.student = student;
		this.id = id;
		this.name = name;
		this.age = age;
	}



	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}



	public int getStudent() {
		return student;
	}



	public void setStudent(int student) {
		this.student = student;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	
	}



	



	@Override
	public String toString() {
		return "Student [student=" + student + ", id=" + id + ", name=" + name + ", age=" + age + ", getStudent()="
				+ getStudent() + ", getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, student);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name) && student == other.student;
	}
}