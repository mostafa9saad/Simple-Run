/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.run;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author user
 */
public class Gui2 extends JFrame{
    JButton b1;
    JLabel l1,l2;
    JPanel p4;
    event e=new event();
 
    public Gui2(){
    this.setTitle("Error");
    this.setVisible(true);
    this.setSize(300, 200);
    this.setLocation(750, 550);
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    p4=new JPanel();
    p4.setBackground(Color.BLACK);
    add(p4);
    l1=new JLabel("An Error Occur ");
    l2= new JLabel("Enter Number Between 1 and 4");
    b1=new JButton("OK");
     p4.setLayout(null);
     l1.setBounds(100, 0, 300, 50);
     l1.setForeground(Color.WHITE);
     p4.add(l1);
     l2.setBounds(50,20, 300, 50);
     l2.setForeground(Color.WHITE);
     p4.add(l2);
     b1.setBounds(100, 100, 75, 25);
     p4.add(b1);
             b1.addActionListener(e);
    
    
    }
    private class event implements ActionListener{
   Gui g=new Gui();
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==b1){
                g.setVisible(false);
                SimpleRun.main(null);
                setVisible(false);
                
                
            }
        }
    
    
    
    
    
    }
}
