//Write a java program to connect to a database using JDBC and delete values from it
package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class DeleteDemo {
    Connection con;
    public DeleteDemo() {
        try{
        String db_url = "jdbc:mysql://localhost/";
        String db_name,db_user,db_password;
        db_name = "student"; db_user = "root"; db_password = "";
        Class.forName("com.mysql.jdbc.Driver"); 
        con = DriverManager.getConnection(db_url+db_name,db_user,db_password);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);
        }
    }
    
    public void show(){   
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM details");
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
        }
        catch(Exception exc){
            System.out.println("Error :"+exc);
        }
        System.out.println();
    }
    public void delete(int id){
        try{
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM details WHERE id ="+id);
        System.out.println("Record having id "+id+" has been deleted");
        }
        catch(Exception e){
            System.out.println("Exception :"+e);
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        DeleteDemo obj =  new DeleteDemo();
        Boolean exit = false;  
        do{
            System.out.println("Choose Option \n1:Show \n2:Delete\n3:Exit");
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            
            switch(key){
                case 1 :obj.show();break;
                case 2 :System.out.println("Enter id of the record to delete");
                    int id = sc.nextInt();
                    obj.delete(id);break;
                case 3 : exit = true;break;
                default:System.out.println("Invalid input");
            }
        }
        while( exit != true);
    }
}
