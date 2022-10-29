package com.jdbc.model;

import java.util.Objects;

public class Employee {
  
	private int employeeId;
	private String employeeName;
	private int employeePhone;
	private String employeeAddress;
	private String employeeEmail;
	private String employeeDepartment;
	
	public Employee(int employeeId, String employeeName, int employeePhone, String employeeAddress,
			String employeeEmail, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
		this.employeeAddress = employeeAddress;
		this.employeeEmail = employeeEmail;
		this.employeeDepartment = employeeDepartment;
	}
	Employee(){
	
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
	public int getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(int employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone="
				+ employeePhone + ", employeeAddress=" + employeeAddress + ", employeeEmail=" + employeeEmail
				+ ", employeeDepartment=" + employeeDepartment + ", getEmployeeId()=" + getEmployeeId()
				+ ", getEmployeeName()=" + getEmployeeName() + ", getEmployeePhone()=" + getEmployeePhone()
				+ ", getEmployeeAddress()=" + getEmployeeAddress() + ", getEmployeeEmail()=" + getEmployeeEmail()
				+ ", getEmployeeDepartment()=" + getEmployeeDepartment() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeAddress, employeeDepartment, employeeEmail, employeeId, employeeName,
				employeePhone);
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
		return Objects.equals(employeeAddress, other.employeeAddress)
				&& Objects.equals(employeeDepartment, other.employeeDepartment)
				&& Objects.equals(employeeEmail, other.employeeEmail) && employeeId == other.employeeId
				&& Objects.equals(employeeName, other.employeeName) && employeePhone == other.employeePhone;
	}
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}
}