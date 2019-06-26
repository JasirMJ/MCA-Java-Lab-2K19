package AppletProgram;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Afactorial extends Applet implements ActionListener {

        TextField t1 = new TextField(10);  
        TextField t2 = new TextField(10);  

        Label l1=new Label("Enter number");
        Label l2=new Label("Factorial");
        Button b=new Button("Calculate");
        
        public void init(){
            
            add(l1);add(t1);
            add(l2);add(t2);
            add(b);
           
            b.addActionListener(this);
        }
        public void actionPerformed(ActionEvent e){
            String str=e.getActionCommand();
            if(str=="Calculate"){
               int fact = 1;
                String r_num=t1.getText();
                System.out.println(r_num);
                int num=Integer.parseInt(r_num);
                for(int i=1; i<=num; i ++){
                 fact=fact * i;    
                }
                String ans=Integer.toString(fact);
                t2.setText(ans);
            }
        }   
}

//<HTML>  
//  
//    <HEAD>  
//        <TITLE>WELCOME TO JAVA APPLET</TITLE>  
//    </HEAD>  
//  
//    <BODY>  
//        <BR>  
//        <APPLET CODE=Afactorial WIDTH=1200 HEIGHT=400> </APPLET>  
//    </BODY>  
//  
//</HTML>