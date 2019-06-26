import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 

class JCalc extends JFrame implements ActionListener { 
    static JFrame f; 
  
    static JTextField l; 
  
    String s0, s1, s2; 
  
    JCalc() 
    { 
        s0 = s1 = s2 = ""; 
    } 
  
    public static void main(String args[]) 
    { 
        f = new JFrame("calculator"); 
        JCalc c = new JCalc(); 
        l = new JTextField(16); 
        l.setEditable(false); 
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, bcl, beq1; 
  
        b0 = new JButton("0"); 
        b1 = new JButton("1"); 
        b2 = new JButton("2"); 
        b3 = new JButton("3"); 
        b4 = new JButton("4"); 
        b5 = new JButton("5"); 
        b6 = new JButton("6"); 
        b7 = new JButton("7"); 
        b8 = new JButton("8"); 
        b9 = new JButton("9"); 
  
        beq1 = new JButton("="); 
  
        ba = new JButton("+"); 
        bs = new JButton("-"); 
        bd = new JButton("/"); 
        bm = new JButton("*"); 
        bcl = new JButton("C"); 
        
        be = new JButton("."); 
  
        bm.addActionListener(c); 
        bd.addActionListener(c); 
        bs.addActionListener(c); 
        ba.addActionListener(c); 
        b9.addActionListener(c); 
        b8.addActionListener(c); 
        b7.addActionListener(c); 
        b6.addActionListener(c); 
        b5.addActionListener(c); 
        b4.addActionListener(c); 
        b3.addActionListener(c); 
        b2.addActionListener(c); 
        b1.addActionListener(c); 
        b0.addActionListener(c); 
        be.addActionListener(c); 
        bcl.addActionListener(c); 
        beq1.addActionListener(c);
  
        f.add(l); 
        f.add(ba); 
        f.add(b1); 
        f.add(b2); 
        f.add(b3); 
        f.add(bs); 
        f.add(b4); 
        f.add(b5); 
        f.add(b6); 
        f.add(bm); 
        f.add(b7); 
        f.add(b8); 
        f.add(b9); 
        f.add(bd); 
        f.add(be); 
        f.add(b0); 
        f.add(bcl); 
        f.add(beq1); 
          
        l.setBounds(30,40,280,30); // x, y, width, height
        b7.setBounds(40,100,50,40);
        b8.setBounds(110,100,50,40);
        b9.setBounds(180,100,50,40);
        bcl.setBounds(250,100,50,40);

        b4.setBounds(40,170,50,40);
        b5.setBounds(110,170,50,40);
        b6.setBounds(180,170,50,40);
        bd.setBounds(250,145,50,40);

        b1.setBounds(40,240,50,40);
        b2.setBounds(110,240,50,40);
        b3.setBounds(180,240,50,40);
        bm.setBounds(250,190,50,40);
        bs.setBounds(250,235,50,40);


        be.setBounds(40,310,50,40);
        b0.setBounds(110,310,50,40);
        beq1.setBounds(180,310,50,40);
        ba.setBounds(250,280,50,70);

        
        
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false); 
    } 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        System.out.println("Action command "+s);
        // if the value is a number 
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') { 
            // if operand is present then add to second no 
            if (!s1.equals("")) 
                s2 = s2 + s; 
            else
                s0 = s0 + s; 
  
            l.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == 'C') { 
            s0 = s1 = s2 = ""; 
  
            l.setText(s0 + s1 + s2); 
        }
        else if (s.charAt(0) == 'D') { 

            String str = l.getText();
            l.setText("");
            for(int i=0;i<str.length()-1;i++)
            l.setText(l.getText()+str.charAt(i));
        } 
        else if (s.charAt(0) == '=') { 
  
            double te; 
  
            if (s1.equals("+")) 
                te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
            else if (s1.equals("-")) 
                te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
            else if (s1.equals("/")) 
                te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
            l.setText(s0 + s1 + s2 + "=" + te); 
            s0 = Double.toString(te); 
            s1 = s2 = ""; 
        } 
        else { 
            if (s1.equals("") || s2.equals("")) 
                s1 = s; 
            else { 
                double te; 
  
                if (s1.equals("+")) 
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2)); 
                else if (s1.equals("-")) 
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2)); 
                else if (s1.equals("/")) 
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2)); 
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2)); 
  
                s0 = Double.toString(te); 
                s1 = s; 
                s2 = ""; 
            } 
  
            l.setText(s0 + s1 + s2); 
        } 
    } 
} 

