package socket;

import java.net.*;
import java.io.*;

public class ClientSocket {
    public static void main(String args[]){
        try{
            Socket s = new Socket("localhost",4000);
            //sending a string
            String str="hello world";
            DataOutputStream out=new DataOutputStream(s.getOutputStream());
            out.writeUTF(str);

            //receiving uppercase string
            DataInputStream in=new DataInputStream(s.getInputStream());
            String upper=in.readUTF();
            System.out.println("Upper case string:"+upper);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }   

}
