public class Thread_Demo extends Thread {
        Thread t;
        String tname;
        
    public static void main(String srgs[]){
        new Thread_Demo("one");
        
    }

       Thread_Demo(String s){
       tname=s;
      // System.out.println("thread name:"+tname);   
       t=new Thread(this);
       t.start();
       }
    public void run(){
        
        for(int i=0;i<10;i++){
            System.out.println(tname+"choose"+i);
            if(i%2 == 0){
                new even(i);
            }
        }
    }
}

class even extends Thread{
       Thread et;
       int sq;
        public even(int sq){
            this.sq=sq;
            et= new Thread(this);
            et.start();
        }
        public void run(){
            System.out.println("Thread Even:" + sq*sq);
        }
}