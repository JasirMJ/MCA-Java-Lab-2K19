//Write a java program using SWING to connect to a database using JDBC and insert values into it
package Jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class SwingInsert extends JFrame implements ActionListener {
    JButton b ;
    JTextField t_name,t_age;
    JLabel l_name,l_age;
    
    SwingInsert(){
        b = new JButton("Insert");
        t_name = new JTextField();
        t_age = new JTextField();
        l_name = new JLabel("Name : ");
        l_age =new JLabel("Age : ");
        
        setLayout(null);
        setSize(500, 300);
        setVisible(true);
        
        l_name.setBounds(30, 30, 100, 30);
        l_age.setBounds(30, 60, 100, 30);
        
        t_name.setBounds(100, 30, 100, 30);
        t_age.setBounds(100, 60, 100, 30);   
        
        b.setBounds(30, 90, 80, 30);
        
        add(b);
        add(l_name);
        add(l_age);
        add(t_age);
        add(t_name);

        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        String name;
        int age;
        if (cmd == "Insert"){
            try{
                Connection con;
                String db_url = "jdbc:mysql://localhost/";
                String db_name,db_user,db_password;
                db_name = "student"; db_user = "root"; db_password = "";
                Class.forName("com.mysql.jdbc.Driver"); 
                con = DriverManager.getConnection(db_url+db_name,db_user,db_password);
                System.out.println("Connected :"+db_name);
                name=t_name.getText();
                age = Integer.parseInt(t_age.getText());
                String course = "MCA";
                Statement stmt=con.createStatement(); 
                stmt.executeUpdate("INSERT INTO details(name,age) VALUE('"+name+"','"+age+"') ");
                System.out.println("Record inserted : "+name+" , "+age);
            }
            catch(Exception exc){
                System.out.println("Error :"+exc);
            }
        }
    }
    
    public static void main(String args[]){
        new SwingInsert();
    }
}
