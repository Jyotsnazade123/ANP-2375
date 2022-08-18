package question.view;

import question1.Customer;
import question1.service.CustomerService;

public class CoustomerView {

	public static void main(String[] args) {
		Customer costumer1= new Customer(3,"Jyotsna",17); // for calling empty constructor
		
		
		CustomerService isEligible = new CustomerService();
		boolean criateria = isEligible.checkEligibilty(costumer1);
		
		if(criateria==true) {
			System.out.println("You are Eligible for voting");
		}
		else {
			System.out.println("You are not Eligible for voting");
		}

	}

}
