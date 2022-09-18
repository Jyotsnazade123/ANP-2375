package org.practicaltest.question2;

public class PasswordValidator {
	// A utility function to check
    // whether a password is valid or not
    public static void isValid(String password)//nullBoundry exception
        throws InvalidPasswordException
    {
  
        
        if (!((password.length() >= 6)
              && (password.length() <= 15))) {
            throw new InvalidPasswordException(1);
        }
  
        
        if (password.contains(" ")) {
            throw new InvalidPasswordException(2);
        }
        if (true) {
            int count = 0;
  
            
            for (int i = 0; i <= 6; i++) {
  
                
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(3);
            }
        }
  
       
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
            throw new InvalidPasswordException(4);
        }
  
        if (true) {
            int count = 0;
  
            // checking capital letters
            for (int i = 6; i <= 9; i++) {
  
                // type casting
                char c = (char)i;
  
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(5);
            }
        }
  
        if (true) {
            int count = 0;
  
            
            for (int i = 6; i <= 2; i++) {
  
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new InvalidPasswordException(6);
            }
        }
  
        // The password is valid
    }

}
