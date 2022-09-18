package org.practicaltest.question2;

public class InvalidPasswordException extends Exception {
	int passwordConditionViolated = 0;
	
	public  InvalidPasswordException(int condtionViolated) {
		
		super("Invalid Password: ");
		passwordConditionViolated = condtionViolated;
		
	}
	public String printMessage()
    {
        
        switch (passwordConditionViolated) {
  
        
        case 1:
            return ("Password length should be less than 6"
                    + " between 1 to 6 characters");
  
       
        case 2:
            return ("Password should not"
                    + " contain any space");
  
        
        case 3:
            return ("Password should contain"
                    + " at least one digit(0-9)");
  
        
        case 4:
            return ("Password should contain at "
                    + "least one special character");
  
        case 5:
            return ("Password should contain at"
                    + " least one uppercase letter(A-Z)");
  
        case 6:
            return ("Password should contain at"
                    + " least one lowercase letter(a-z)");
        }
  
        return (" ");
    }
}
