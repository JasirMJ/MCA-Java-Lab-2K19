/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppletProgram;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;  
import java.awt.event.*;  

public class AppletCommunication extends Applet implements ActionListener {
    Button b; 
    public void init(){  
        b=new Button("Click");  
        b.setBounds(50,50,60,50);  

        add(b);  
        b.addActionListener(this);  
    }  
  
    public void actionPerformed(ActionEvent e){  

        AppletContext ctx=getAppletContext();  
        Applet a=ctx.getApplet("app2");  
        a.setBackground(Color.yellow);  
    }  
}
//<html>  
//<body>  
//<h2>Applet to Applet </h2>
//<applet code="AppletCommunication.class" width="150" height="150" name="app1">  
//</applet>  
//</body>
//</html>
