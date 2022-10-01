package question2.thread;

public class ThankYou extends Thread {
	
		   synchronized public void run() {
				try {
					int i =0;
					while(i<3) {
						sleep(4000);
						System.out.println("ThankYou");
						i++;
					}
				}catch(Exception e) {
				}
			}
		}
		   
