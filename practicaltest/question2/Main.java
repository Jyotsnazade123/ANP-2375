package org.practicaltest.question2;

public class Main {
	 public static void main(String[] args) throws InvalidPasswordException
	    {
	  
	        String password1 = "HeartsForWin";
	  
	        System.out.println("Is Password "
			                   + password1 + " valid?");
			isValid(password1);
			System.out.println("Valid Password");
	  
	        String password2 = "Anu029@FOUNDATION";
	        System.out.println("\nIs Password "
			                   + password2 + " valid?");
			isValid(password2);
			System.out.println("Valid Password");
	    }

	private static void isValid(String password1) {
		// TODO Auto-generated method stub
		
	}
	}