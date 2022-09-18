package org.practicaltest.question1;

import java.util.Scanner;

public class EmployeeView {
	static Scanner scanner=new Scanner(System.in);
	public static boolean addEmployee() {
		System.out.println("Employee add method");
		System.out.println("Enter a employee id");
		int employeeId=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter a employee name");
		String employeeName=scanner.nextLine();
		System.out.println("Enter a date of joining");
		String dateOfJoining=scanner.nextLine();
		
		
		Employee employee=new Employee(employeeId,employeeName,dateOfJoining);
		EmployeeService.addEmployee(employee);
		return true;
	}

		public static Employee[] displayEmployees() {
			return EmployeeService.displayEmployees();
		}
	}





