/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabprograms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
public class CounterExample extends JFrame implements ActionListener {
 
/**
* 
*/
private static final long serialVersionUID = 1L;
JLabel label,labeltemp;
JTextField result,input;
JButton convert;
float farent,value;
 
   public CounterExample() {
     this.setTitle("Temperature convertion !!!");
     
     farent = 0;
     label = new JLabel("Farent");
     result = new JTextField("0", 4);
     
     labeltemp = new JLabel("Temperature");
     input = new JTextField("0", 4);
     
     convert = new JButton("Convert");
     convert.addActionListener(this);
       
     this.add(labeltemp);
     this.add(input);
     this.add(label);
     this.add(result);
     this.add(convert);
     
     this.setLocation(500, 500);
     this.setSize(500, 100);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.getContentPane().setLayout(new FlowLayout());
     this.setVisible(true);
  }
 
  @Override
  public void actionPerformed(ActionEvent ae) {
    if (ae.getSource() == convert) {
         farent = 0;
         value = Float.parseFloat(input.getText());
         farent = value * (9/5) + 32;
         result.setText(String.valueOf(farent));
         this.repaint();
     }
  }
 
  public static void main(String[] args) {
     new CounterExample();
  }
}