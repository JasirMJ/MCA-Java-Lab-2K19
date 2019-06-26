/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Infinity Thrissur
 */
public class Home  extends JFrame{

    public Home() {
        
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.red);
        JLabel one= new JLabel("Welcome User");
        add(one);
        one.setBounds(100, 100, 100, 80);
    }
    
       
    
    public static void main(String[] args) {
        new Home();
    }
}
