package org.practicaltest.question1;


public class EmployeeService {
	public static boolean addEmployee(Employee employee) {
	boolean result=false;
	EmployeeDAO.addEmployee(employee);
	return result;
	}
	public static Employee[] displayEmployees() {
		return EmployeeDAO.displayEmployees();
	}
}