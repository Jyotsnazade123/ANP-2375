package com.anudip.crud.daoimpl;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.crud.config.HibernateUtil;
import com.anudip.crud.dao.EmployeeDao;

import com.anudip.crud.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
      Scanner sc = new Scanner(System.in);
      
      
	public void getEmployee() {
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter your employee id");
			int i = sc.nextInt();
			Employee e = session.get(Employee.class, i);
			System.out.println("-----------Employee Details are------");
			System.out.println(
					e.getEid() + " " + e.getEname() + " " + e.getEmail() + " " + e.getPhone() + " " + e.getAddr());
		} catch (HibernateException e) {
			System.out.println(e);

		}
		// TODO Auto-generated method stub
	}

		public void addEmployee() {
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			String name, add, email;
			int phone;

			System.out.print("Enter Employee Name :");
			name = sc.nextLine();

			System.out.print("Enter Employee Address :");
			add = sc.nextLine();

			System.out.print("Enter Employee Email :");
			email = sc.nextLine();

			System.out.print("Enter Employee Phone :");
			phone = sc.nextInt();

			Employee employee = new Employee();

			employee.setEname(name);
			employee.setEmail(email);
			employee.setAddr(add);
			employee.setPhone(phone);

			session.save(employee);
			tx.commit();
			System.out.println("* Added Successfully *");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		
	}

	public void updateEmployee() {
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			System.out.println("Enter your customer id");
			int i = sc.nextInt();
			Employee e1 = session.get(Employee.class, i);
			System.out.println(" Enter update phone number");
			long p1 = sc.nextLong();
			e1.setPhone(p1);
			session.update(e1);
			tx.commit();
			System.out.println("update successfully");
			}catch(HibernateException e) {
			System.out.println(e);
			}
		
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee() {
		
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			System.out.println("Enter your customer id");
			int i = sc.nextInt();
			Employee e2 = session.get(Employee.class, i);
			
			session.delete(e2);
			tx.commit();
			System.out.println("deleted successfully");
			}catch(HibernateException e) {
			System.out.println(e);
		// TODO Auto-generated method stub
		
	}
	
}
}