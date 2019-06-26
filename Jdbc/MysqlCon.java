package Jdbc;

import java.sql.*;

public class MysqlCon {
    static Connection con;
    static Statement st;
    static ResultSet rs;
    
    static String db_url="jdbc:mysql://localhost/student"; //Connection String
    
    public static void setConnection()
    {
        try {
            System.out.println("connecting");
            Class.forName("com.mysql.jdbc.Driver"); 
            con=DriverManager.getConnection(db_url,"root","root");
            System.out.println("connected");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from emp");  
            while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();  
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error "+ ex);
        }  
    }
    public static void main(String args[]){
        setConnection();
    }
}