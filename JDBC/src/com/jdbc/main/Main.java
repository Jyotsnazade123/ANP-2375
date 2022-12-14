package com.jdbc.main;

import java.io.IOException;

import java.util.Scanner;

import com.jdbc.dao.EmployeeDAO;
import com.jdbc.model.Employee;




public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Application");

		while(true) {
			System.out.println();
			System.out.println("1. Add Employee");
			System.out.println("2. Delete Employee");
			System.out.println("3. Display Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Exit");
			System.out.print("Enter Your Choice : ");
			int choice = sc.nextInt();

			switch(choice) {
			case 1:
				System.out.println("Enter Employee Details ");
				System.out.print("Id : ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Name : ");
				String name = sc.nextLine();

				System.out.print("Phone : ");
				int phone = sc.nextInt();

				System.out.print("Address : ");
				String address = sc.nextLine();

				System.out.print("Email : ");
				String email = sc.nextLine();

				System.out.print("Department : ");
				String department = sc.nextLine();

				Employee employee = new Employee(id, name, phone, address, email, department);
				boolean isAdded = EmployeeDAO.insertEmployeeToDB(employee);

				if(isAdded) {
					System.out.println("Employee Added Successfully");
				}else {
					System.out.println("Someting went wrong");
				}

				System.out.println(employee);
				break;

			case 2:
				System.out.print("Enter Employee Id to delete Employee : ");
				int empId = sc.nextInt();
				boolean isDeleted = EmployeeDAO.deleteEmployee(empId);
				if(isDeleted) {
					System.out.println("Employee Deleted Successfully");
				}else {
					System.out.println("Someting went wrong");
				}

				break;

			case 3:
				EmployeeDAO.displayAllEmployee();
				break;

			case 4:
				System.out.println("Update Employee");
				break;

			case 5:
				System.out.println("Thanks");
				System.exit(0);
				break;

			default :
				System.out.println("Invalid Choice");
			}


		}

	}

}