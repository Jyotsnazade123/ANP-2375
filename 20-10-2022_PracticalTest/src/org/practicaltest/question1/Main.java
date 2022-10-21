package org.practicaltest.question1;

import java.util.Scanner;

public class Main {
	  public static void main(String arg[]) {  
	        Scanner sc = new Scanner(System.in);  
	        System.out.print("How many number of customers do you want to input? ");  
	        int n = sc.nextInt();  
	        Customer C[] = new Customer[n];  
	        for (int i = 0; i < C.length; i++) {  
	            C[i] = new Customer();  
	            C[i].createAccount();  
	        }  
	        int ch;  
	        do {  
	            System.out.println("\n ***Banking System Application***");  
	            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Set the amount \n 4. Withdraw the amount \n 5.Exit ");  
	            System.out.println("Enter your choice: ");  
	            ch = sc.nextInt();  
	                switch (ch) {  
	                    case 1:  
	                        for (int i = 0; i < C.length; i++) {  
	                            C[i].showAccount();  
	                        }  
	                        break;  
	                    case 2:  
	                        System.out.print("Enter account no. you want to search: ");  
	                        String ac_no = sc.next();  
	                        boolean found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 3:  
	                        System.out.print("Enter Account no. : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                C[i].setAmount();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 4:  
	                        System.out.print("Enter Account No : ");  
	                        ac_no = sc.next();  
	                        found = false;  
	                        for (int i = 0; i < C.length; i++) {  
	                            found = C[i].search(ac_no);  
	                            if (found) {  
	                                C[i].withDrawAmount();  
	                                break;  
	                            }  
	                        }  
	                        if (!found) {  
	                            System.out.println("Search failed! Account doesn't exist..!!");  
	                        }  
	                        break;  
	                    case 5:  
	                        System.out.println("Hello Mamata your account balance is...");  
	                        break;  
	                }  
	            }  
	            while (ch != 4);  
	        }  
	    }  
	 
	    	        