package org.practicaltest.question1;

import java.util.Scanner;

public class Customer {
	
	private String accountNumber;
	private String  accountName;
	private double accountBalance;
	
	Scanner sc = new Scanner(System.in); 
	
	
	public void createAccount() { 
		
        System.out.print("Enter Account Number: ");  
        accountNumber  = sc.next();  
          
        System.out.print("Enter Name: ");  
        accountName = sc.next();  
        
        System.out.print("Enter Balance: ");  
        accountBalance = sc.nextLong();  
    }  
	
	public void showAccount() { 
		System.out.println("Account no.: " + accountNumber);
        System.out.println("Name of account holder: " + accountName);  
        System.out.println("Balance: " + accountBalance);  
    }  

	 public void setAmount() {  
	        long amt;  
	        System.out.println("add amount to accountBalance: ");  
	        amt = sc.nextLong();  
	        accountBalance = accountBalance + amt;  
	    }  
	 
	  public void withDrawAmount() {  
	        long amt;  
	        System.out.println("Enter the amount to withdraw amount from accBalance: ");  
	        amt = sc.nextLong();  
	        if (accountBalance >= amt) {  
	            accountBalance = accountBalance - amt;  
	            System.out.println("Balance after withdrawal: " + accountBalance);  
	        } else {  
	            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
	        }
	  }
	         
	        
	        public boolean search(String ac_no) {  
	            if (accountNumber.equals(ac_no)) {  
	                showAccount();  
	                return (true);  
	            }  
	            return (false);  
	        }  
	    }  
       
     