package question1.service;

import question1.Customer;

public class CustomerService {
	
    public boolean checkEligibilty(Customer custObj) {
	boolean result=false;
	
		if(custObj.getCurtomerage()>=18) {
		result = true;
	}
	
	return result;
}

}
