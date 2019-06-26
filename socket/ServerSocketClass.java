
package socket;

import java.net.*;
import java.io.*;

public class ServerSocketClass {
    public static void main(String args[]){
        try{
           ServerSocket ss=new ServerSocket(4000);
           Socket s=ss.accept();
           //receiving string
           DataInputStream in=new DataInputStream(s.getInputStream());
           String str=(String)in.readUTF();
           //converting to uppercase
           String upper=str.toUpperCase();
           //replaying
           DataOutputStream out=new DataOutputStream(s.getOutputStream());
           out.writeUTF(upper);
           
        }catch(Exception e){
           System.out.println(e); 
        }
    }
}
