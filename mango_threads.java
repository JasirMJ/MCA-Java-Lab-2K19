/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author New User
 */
public class mango_threads extends Thread {
    String name;
    Thread t;

    mango_threads(String t_name) {
        name=t_name;
    }
    public void start(){
        if(t==null){
            t=new Thread();
            t.start();
        }
    }
    public void run(){
        System.out.println("thread not created");
        try{
            for(int i=0;i<5;i++){
             System.out.println(i);
             t.sleep(1000);
            }   
        }catch(Exception e){
            System.out.println(e);
        }      
    }
}

class mainClass{
    public static void main(String args[]){
        mango_threads mt = new mango_threads("thread1");
        mt.start();
    }
}