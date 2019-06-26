import java.util.*;

public class ThreadDemo extends Thread{
    Thread t,t_odd,t_even;
    String name;
    public Random r;
    int num;
    
    ThreadDemo(String name){
        name = name;
        t = new Thread(this,name);
        t.start();
    }
    
    public void run(){
        try{
            r=new Random();
            for(int i = 1;i<=3;i++){
                System.out.println("Count : "+ i);
                num=r.nextInt(100);
                System.out.println("System chooses : "+ num);
                if(num%2==0){
                    t_even = new Thread(new EvenThread(num));
                    t_even.start();
                }
                else{
                    t_odd = new Thread(new OddThread(num));
                    t_odd.start();
                }
                t.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
    
    public static void main(String args[]){
        new ThreadDemo("Thread one ");
    }
}

class EvenThread extends Thread{
    int square;
    EvenThread(int val){
        square = val;
    }
    public void run(){
        System.out.println("Even Thread working :" + square*square);
    }
}
class OddThread extends Thread{
    int cube;
    OddThread(int val){
        cube = val;
    }
    public void run(){
        System.out.println("Odd Thread working :" + cube*cube*cube);
    }
}
