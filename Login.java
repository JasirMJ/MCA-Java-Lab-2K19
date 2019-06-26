

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
JLabel l1=new JLabel("UserId");
JLabel l2=new JLabel("Password");
JTextField t=new JTextField();
JPasswordField p=new JPasswordField();
JButton b=new JButton("Login");

    public Login() {
         
    this.setLayout(null);
    this.setVisible(true);
    this.setSize(700,650);
    
    l1.setBounds(100,100,200,40);
    l2.setBounds(100,200,200,40);
    add(l1);
    add(l2);
    t.setBounds(250,100,150,40);
    add(t);
    p.setBounds(250,200,150,40);
    add(p);
    b.setBounds(200,300,100,60);
    add(b);
    b.addActionListener(this);
         
    }

     public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String uname, pss;
        uname = t.getText();
        pss = p.getText();
        
        if( uname.isEmpty() || pss.isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill the fields","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if( uname.equals("abcde") && pss.equals("Password")){
                JOptionPane.showMessageDialog(null, "Loged In!");
                this.setVisible(false);
                Home homee = new Home();
                homee.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Data","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }   
}
