
import javax.swing.*;
import java.awt.event.*;

public class JbuttonDemo implements ActionListener {
    JButton b1,b2 ;
    JTextField tf ;
    JFrame f;
    JbuttonDemo(){
        
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        tf = new JTextField();
        f = new JFrame();
        
        tf.setBounds(30,40,280,30);
        b1.setBounds(40,100,200,40);
        b2.setBounds(40,150,200,40);

//        btn.setBounds();
        
        f.add(tf);
        f.add(b1);
        f.add(b2);
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400,500);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
  
    }
    public void actionPerformed(ActionEvent e){
        String str;
        str = e.getActionCommand();
        if(str=="button1"){
            tf.setText("You pressed button1");
        }
        if(str.equals("button2")){
            tf.setText("You pressed button2");
        }
    }
    public static void main(String arg[]){
        new JbuttonDemo();
    }
}
