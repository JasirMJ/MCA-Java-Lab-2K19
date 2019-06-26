
import java.util.Scanner;

class ThreadTest extends Thread{
    
    private Thread thread;
    private String threadName;

    ThreadTest(String msg) {
        threadName = msg;
        System.out.println("Creating Thread: "+ threadName);
    }

    public void run(){
        System.out.println("Running Thread: "+threadName);
         try {
        for (int i = 0; i < 5; i++) {
            System.out.println("The "+threadName+" :"+i);
                Thread.sleep(1000);
        }
            } catch (InterruptedException ex) {
                System.out.println("Thread is interrupted");
            }
    }
    public void start(){
        System.out.println("Starting: " +threadName);
        if (thread == null) {
            thread = new Thread(this,threadName);
            thread.start();
        } else {
        }
    }
}

public class MultiThread {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Threads require");
        int limit = sc.nextInt();
        for( int i = 0; i < limit; i++){
        ThreadTest t1 = new ThreadTest("Thread "+(i+1));
        t1.start();
        t1.join();
        }    
    }
}
