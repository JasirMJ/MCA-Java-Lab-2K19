package Jdbc;

import java.awt.*;
import java.awt.event.*; 
import java.sql.*;

public class AwtJdbc implements ActionListener {
    
    TextField t1;
    Label l1,l2;
    Button b;
    Frame f;
    
    AwtJdbc(){
        t1=new TextField();
        l1=new Label("Enter your Database name ");
        l2=new Label("");
        b=new Button("Connect");
        f=new Frame("JDBC Connection");

        l1.setBounds(70, 70, 160, 50);//X ,Y , Width , Height
        l2.setBounds(120,170,450,50);
        t1.setBounds(250,80,150,30);
        b.setBounds(210,130,80,30);

        f.add(t1);
        f.add(l1);
        f.add(l2);
        f.add(b);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,300);
        
        b.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        String str=e.getActionCommand();
        Connection con;
        String db_url = "jdbc:mysql://localhost/";
        String db_name;
        db_name = t1.getText();
        
        if(str=="Connect"){
            try{
                System.out.println("Database name : "+ db_name);
                Class.forName("com.mysql.jdbc.Driver"); 
                con = DriverManager.getConnection(db_url+db_name,"root","root");
                System.out.println("connected");
                l2.setText("Database Connected to :"+db_name);
            }
            catch(Exception ex){
                l2.setText("Unknown Database : "+db_name);
            }
        }
    }
     public static void main(String args[]){
         AwtJdbc obj=new AwtJdbc();
     }   
}