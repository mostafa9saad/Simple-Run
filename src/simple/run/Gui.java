/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.run;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static simple.run.SimpleRun.k;
import static simple.run.SimpleRun.r;
import static simple.run.SimpleRun.s;
import static simple.run.SimpleRun.t;
import static simple.run.SimpleRun.total_burnt;

/**
 *
 * @author user
 */
public class Gui extends JFrame {
    
   
    
    
    
    
    
    JButton b1,b2;
        JTextField t1,t2;
        JPanel p1,p2;
         JLabel l1,g1,g2,g3,g4,l2,l3;
         ButtonGroup bg1;
        event e =new event();
        SimpleRun sr;
           public  char su;
          public int time;
       public  Gui g;
        
        
        
        
        
    public Gui(){
        this.setTitle("Simple Run");
        this.setVisible(true);
        this.setSize(600,500);
        this.setResizable(false);
        this.setLocation(650,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1=new JPanel();
         p1.setBackground(Color.BLACK);
        this.add(p1);
       
        b2=new JButton("Result");
       b1=new JButton("Add Activity");
        l1=new JLabel("Add Activities");
        g1=new JLabel("1:Swimming");
        g2=new JLabel("2:Running");
        g3=new JLabel("3:Kick_Boxing");
        g4=new JLabel("4:Strength_Training");
        l2=new JLabel("enter choices:");
        l3=new JLabel("time / min:");
        t1=new JTextField();
        t2=new JTextField();
        bg1=new ButtonGroup();
        p1.setLayout(null);
        
        g1.setBounds(100, 50, 400, 50);
        g1.setFont(new Font("shrif",Font.PLAIN,20));
        g1.setForeground(Color.WHITE);
        p1.add(g1);
        g2.setBounds(100, 120, 400, 50);
        g2.setFont(new Font("shrif",Font.PLAIN,20));
        g2.setForeground(Color.WHITE);
        p1.add(g2);
        g3.setBounds(100, 190, 400, 50);
        g3.setFont(new Font("shrif",Font.PLAIN,20));
        g3.setForeground(Color.WHITE);
        p1.add(g3);
        g4.setBounds(100, 260, 400, 50);
        g4.setFont(new Font("shrif",Font.PLAIN,20));
        g4.setForeground(Color.WHITE);
        p1.add(g4);
       t1.setBounds(95,310, 60, 25);
        p1.add(t1);
       t2.setBounds(365,310, 60, 25);
        p1.add(t2);
        l1.setBounds(200, 10, 300, 30);
        l1.setFont(new Font("shrif",Font.PLAIN,30));
        l1.setForeground(Color.WHITE);
        p1.add(l1);
        b1.setBounds(200,350, 100, 25);
        p1.add(b1);
        l2.setBounds(10, 310, 100, 25);
        l2.setForeground(Color.WHITE);
        p1.add(l2);
        l3.setBounds(300, 310, 100, 25);
        l3.setForeground(Color.WHITE);
        p1.add(l3);
       b2.setBounds(50,400, 75, 50);
       p1.add(b2);
        
        b1.addActionListener(e);
        b2.addActionListener(e);
      
        
     
}
    private  class event implements ActionListener{
            
      
        @Override
        public void actionPerformed(ActionEvent e) {
              
              if(e.getSource()== b1){
                  if(t1.getText().charAt(0)=='1'||t1.getText().charAt(0)=='2'||t1.getText().charAt(0)=='3'||t1.getText().charAt(0)=='4'){
                  int time;
                  String v;
                 char t=t1.getText().charAt(0);
                 v=t2.getText();
                 time= Integer.parseInt(v);
                 SimpleRun.activity(time,t);
                 t1.setText(" ");
                 t2.setText(" ");
                  setVisible(false);
              }
  
                  else{
                 
                  Gui2 m=new Gui2();
        }
                 
              }
              
           if(e.getSource()==b2){
           
           Gui3 k =new Gui3();
               setVisible(false);
           
           }
           
            
              
          
        }
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

      



}
  
    
    
    
    
    
    

