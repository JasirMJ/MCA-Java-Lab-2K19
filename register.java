

import com.mysql.jdbc.StringUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Infinity Thrissur
 */
public class register extends JFrame implements ActionListener
{
JLabel l1=new JLabel("NAME");
JLabel l2=new JLabel("User Name");
JLabel l3=new JLabel("Password");
JLabel l4=new JLabel("Confirm Password");
JTextField t1=new JTextField();
JTextField t2=new JTextField();
JPasswordField p1=new JPasswordField();
JPasswordField p2=new JPasswordField();
JButton b=new JButton("SUBMIT");

public register()
{
    this.setLayout(null);
    this.setVisible(true);
    this.setSize(700,650);
    
    l1.setBounds(100,100,200,40);
    l2.setBounds(100,200,200,40);
    l3.setBounds(100,300,200,40);
    l4.setBounds(100,400,200,40);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    t1.setBounds(250,100,150,40);
    add(t1);
    t2.setBounds(250,200,150,40);
    add(t2);
    p1.setBounds(250,300,150,40);
    p2.setBounds(250,400,150,40);
    add(p1);
    add(p2);
    b.setBounds(200,500,100,60);
    add(b);
    b.addActionListener(this);
}
    public static void main(String[] args) 
    {
        new register();
    }
    public void actionPerformed(ActionEvent ar) 
    {
        String uname, uid, pass, cpass;
        uname = t1.getText();
        uid = t2.getText();
        pass = p1.getText();
        cpass = p2.getText();
        System.out.println(uname+" : "+uid);
        if( uname.isEmpty() || uid.isEmpty() || pass.isEmpty() || cpass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill the fields");
        }
        else{
            if( pass.equals(cpass)){
                 JOptionPane.showMessageDialog(null, "Registered!");
                 this.setVisible(false);
                 login lg = new login();
                 lg.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Password Not Match","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}