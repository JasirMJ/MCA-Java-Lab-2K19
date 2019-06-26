package socket;
//SENDER

import java.net.*;

public class UDPStringSender {
    public static void main(String args[]) throws Exception{
        DatagramSocket ds=new DatagramSocket();
        String str="Hello World";
        InetAddress ip=InetAddress.getByName("localhost");
        DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);
        
        byte[] buf=new byte[1024];
        DatagramPacket dp1= new DatagramPacket(buf,1024);
        ds.receive(dp1);
        String len=new String(dp1.getData(),0,dp1.getLength());
        int answer=Integer.parseInt(len);
        System.out.println("String Length: "+answer);
    }
}
