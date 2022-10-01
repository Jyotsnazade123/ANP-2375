package question2.main;

import question2.thread.ThankYou;
import question2.thread.Welcome;

public class Main {
	public static void main(String []args) {
		Welcome t1=new Welcome();
		ThankYou t2=new ThankYou();
		t1.start();
		t2.start();
	}
	     
}