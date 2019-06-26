import java.awt.event.*;
import javax.swing.*;  

public class CheckBoxExample implements ActionListener
{  
    JCheckBox checkBox1,checkBox2;
    JTextField t ;
    
     CheckBoxExample(){  
        
        JButton b = new JButton("ok");
        t = new JTextField();
        
        JFrame f= new JFrame("CheckBox Example");  
        
        checkBox1 = new JCheckBox("C++");  
        checkBox1.setBounds(100,100, 50,50);  
        
        checkBox2 = new JCheckBox("Java");  
        checkBox2.setBounds(100,150, 50,50); 
        
        f.add(t);
        f.add(checkBox1);  
        f.add(checkBox2); 
        f.add(b);
        
        t.setBounds(80,70,200,50);
        b.setBounds(80,200,150,50);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 
        
        checkBox1.addActionListener(this);
        checkBox2.addActionListener(this);
        b.addActionListener(this);
    } 
     
     public void actionPerformed(ActionEvent e){
         String str1 = "false";
         String str2 = "false";
         
         if(checkBox1.isSelected()){
             str1 = "true";
         }else{
             str1 = "false";
         }
         if(checkBox2.isSelected()){
             str2 = "true";
         }else{
             str2 = "false";
         }
         if(e.getActionCommand().equals("ok")){
             t.setText("cpp : "+str1+"\njava : "+str2);
         }
     }
     
public static void main(String args[])  
    {  
    new CheckBoxExample();  
    }
}  