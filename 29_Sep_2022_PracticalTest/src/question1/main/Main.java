package question1.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

public class Main {
	

	class Customer{
	
	String name;
    public void setFirstName(String name) throws InvalidNameException {
        this.name = name;
        char a[] = name.toCharArray();
        if(a.length <6){
            throw new InvalidNameException();
        }
        else{
            Pattern p = Pattern.compile("[a-z]",Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(name);
            boolean b = m.find();
            if(!b){
                throw new InvalidNameException();
            }
        }
    }
}
}