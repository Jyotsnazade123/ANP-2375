package question3.main;

public class Main {
	
	public static void main(String[] args)
    {
         Runnable myThread = () ->
        {
            Thread.currentThread().setName("welcome to lamba expression ");
            System.out.println(
                Thread.currentThread().getName()
                + " thread");
        };
          Thread run = new Thread(myThread);
          run.start();
    }
}
       