package com.anudip.crud;

import java.util.Scanner;


import com.anudip.crud.daoimpl.EmployeeDaoImpl;
import com.anudip.crud.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDaoImpl edao = new EmployeeDaoImpl();
        char a;
        do {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("-----------Employee Mangement-------");
        	System.out.println("Enter your choice");
        	System.out.println("1.Read\n 2.Add\n 3.Update\n 4.Delete\n 5.Exit");
             int ch = sc.nextInt();
             switch(ch) {
             case 1: edao.getEmployee();
             break;
             
             case 2: edao.addEmployee();
             break;
             
             case 3: edao.updateEmployee();
             break;
             
             case 4: edao.deleteEmployee();
             break;
             
             case 5: System.exit(0);
             break;
             
             default:
            	 System.out.println("invalid entry");
             }
           System.out.println("Do you want to continue ? Y/N");
           a = sc.next().charAt(0);
        }while(a =='Y' || a=='y');
        System.out.println("Thank You..........");
            	 
             }
        
        
    



    }

