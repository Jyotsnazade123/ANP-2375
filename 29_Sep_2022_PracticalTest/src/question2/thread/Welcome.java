package question2.thread;

public class Welcome extends Thread {
	synchronized public void run() {
		try {
			int i =0;
			while(i<5) {
				sleep(2000);
				System.out.println("Welcome");
				i++;
			}
		}catch(Exception e) {
		}
	}
}
   
			
