package socket;

import java.net.*;
public class UDPStringRecever {
  public static void main(String args[]) throws Exception{
      
      DatagramSocket ds=new DatagramSocket(3000);
//String receiving

      byte[] buf=new byte[1024];
      DatagramPacket dp=new DatagramPacket(buf,1024);
      ds.receive(dp);
      String str=new String (dp.getData(),0,dp.getLength());
      System.out.println(str);
      
//String length calculation
      
      int len=str.length();//length calculated in integer
      String msg=Integer.toString(len);//length converted to string
      System.out.println(msg);
//reply
    InetAddress ip1= dp.getAddress();
    int port=dp.getPort();
    DatagramPacket dp1=new DatagramPacket(msg.getBytes(),msg.length(),ip1,port);
    ds.send(dp1);  
  }  
}
