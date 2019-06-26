import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureConversion extends JFrame implements ActionListener {
 
    private static final long serialVersionUID = 1L;
    JLabel label,labeltemp;
    JTextField result,input;
    JButton convert;
    double farent,value;
 
   public TemperatureConversion() {
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
         value = Double.parseDouble(input.getText());
         farent = (9.0/5.0) * value + 32;
         result.setText(String.valueOf(farent));
         this.repaint();
     }
  }
  
  public static void main(String[] args) {
     new TemperatureConversion();
  }
}