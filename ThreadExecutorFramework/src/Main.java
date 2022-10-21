import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
     public static void main(String[] args)throws RuntimeException {
    	 Executor excutor=Executors.newScheduledThreadPool(2);
    	 excutor.execute(new CopyTask());
    	 excutor.execute(new DisplayTask());
    	 excutor.execute(new SpellcheckTask());
    	
     }
}
