package org.practicaltest.question1;

public class EmployeeDAO {
	static Employee employeeArray[]=new Employee[5];
	public static boolean addEmployee(Employee employee) {
		boolean result=false;
		
		for(int i=0;i<employeeArray.length;i++)
		{
			if(employeeArray[i]==null) {
				employeeArray[i]=employee;
				result=true;
				break;
			}
		}
		
		return result;
	}
	public static Employee[] displayEmployees() {
		return employeeArray;
	}
	}

