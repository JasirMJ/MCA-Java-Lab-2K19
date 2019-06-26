package MulticastSocket;

import java.io.*;
import java.util.*;
import java.net.*;

public class GroupChat
{
    private static final String TERMINATE  ="Exit";
    static String name;
    static boolean finished=false;
    public static void main(String[] args){
        try {
            InetAddress group=InetAddress.getByName("239.250.250.250");
            int port=Integer.parseInt("4789");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Your name ");
            name=sc.nextLine();
            MulticastSocket socket=new MulticastSocket(port);
            //socket.setTimeToLive(0);
            socket.joinGroup(group);
            Thread t=new Thread(new ReadThread(socket,group,port));
            t.start();
            System.out.println("Start Typing Messages--");
            while(true)
            {
                String message;
                message=sc.nextLine();
                if(message.equalsIgnoreCase(GroupChat.TERMINATE))
                {
                    finished=true;
                    socket.leaveGroup(group);
                    socket.close();
                    break;
                }
                message=name+":"+message;
                byte[] buffer=message.getBytes();
                DatagramPacket datagram=new
                DatagramPacket (buffer,buffer.length,group,port);
                socket.send(datagram);
            }
        }
        catch(SocketException se) {}
        catch(IOException so) {}
    }
}
class ReadThread implements Runnable
{
    private MulticastSocket socket;
    private InetAddress group;
    private int port;
    private static final int MAX_PRITZ=1000;
    ReadThread(MulticastSocket socket,InetAddress group,int port)
    {
        this.socket=socket;
        this.group=group;
        this.port=port;
    }
    @Override
    public void run()
    {
        while(!GroupChat.finished)
        {
            byte[] buffer=new byte[ReadThread.MAX_PRITZ];
            DatagramPacket datagram=new
            DatagramPacket(buffer,buffer.length,group,port);
            String message;
            try{
                socket.receive(datagram);
                message=new String(buffer,0,datagram.getLength(),"UTF-8");
                if(!message.startsWith(GroupChat.name))
                    System.out.println(message);
            }
            catch(IOException e)
            {
            }
        }
    }
}