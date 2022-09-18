package org.practicaltest.question1;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeDateOfJoining;



public Employee() {
	super();
	// TODO Auto-generated constructor stub

}

public Employee(int employeeId, String employeeName, String employeeDateOfJoining) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeDateOfJoining = employeeDateOfJoining;
}

public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public String getEmployeeDateOfJoining() {
	return employeeDateOfJoining;
}
public void setEmployeeDateOfJoining(String employeeDateOfJoining) {
	this.employeeDateOfJoining = employeeDateOfJoining;
}

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDateOfJoining="
			+ employeeDateOfJoining + ", getEmployeeId()=" + getEmployeeId() + ", getEmployeeName()="
			+ getEmployeeName() + ", getEmployeeDateOfJoining()=" + getEmployeeDateOfJoining() + "]";
}

@Override
public int hashCode() {
	return Objects.hash(employeeDateOfJoining, employeeId, employeeName);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return employeeDateOfJoining == other.employeeDateOfJoining && employeeId == other.employeeId
			&& Objects.equals(employeeName, other.employeeName);
}

public void display() {
	// TODO Auto-generated method stub
	
}
}

