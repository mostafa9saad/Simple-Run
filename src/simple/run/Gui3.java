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
import java.text.DecimalFormat;
import javax.swing.*;


public class Gui3 extends JFrame {
JLabel t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12;
JLabel lr,l2,l3,ls,l4,l5,l6,lu,l7,l8,lk,l9,l10,lt,l11,l12;
JPanel p3;
JButton b1;
event e=new event();
SimpleRun s;
Gui g;
public static DecimalFormat h=new DecimalFormat("#.##");
public Gui3(){

this.setTitle("result");
this.setVisible(true);
this.setSize(600,700);
this.setResizable(false);
this.setLocation(650,100);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p3=new JPanel();
p3.setBackground(Color.BLACK);
this.add(p3);
lr=new JLabel("result :");
l2=new JLabel("total calories burnt​:");
t2=new JLabel();
l3=new JLabel("total heart rate​:");
t3=new JLabel();
ls=new JLabel("Activities Rank: ");
l4 =new JLabel();
l5=new  JLabel("calories burnt:");
t5=new JLabel();
l6=new JLabel("heart rate increase:");
t6=new JLabel();
lu =new JLabel();
l7=new  JLabel("calories burnt:");
t7=new JLabel();
l8=new JLabel("heart rate increase:");
t8=new JLabel();
lk =new JLabel();
l9=new  JLabel("calories burnt:");
t9=new JLabel();
l10=new JLabel("heart rate increase:");
t10=new JLabel();
lt =new JLabel();
l11=new  JLabel("calories burnt:");
t11=new JLabel();
l12=new JLabel("heart rate increase:");
t12=new JLabel();
b1=new JButton("Show");
p3.setLayout(null);
lr.setBounds(10, 10, 175, 50);
lr.setFont(new Font("shrif",Font.PLAIN,30));
lr.setForeground(Color.WHITE);
p3.add(lr);
l2.setBounds(20, 50, 110, 50);
l2.setForeground(Color.WHITE);
p3.add(l2);
t2.setBounds(130, 65, 75, 20);
t2.setForeground(Color.CYAN);
p3.add(t2);
l3.setBounds(20, 90, 90, 50);
l3.setForeground(Color.WHITE);
p3.add(l3);
t3.setBounds(110,105, 150, 20);
t3.setForeground(Color.CYAN);
p3.add(t3);
ls.setBounds(10, 130, 250, 50);
ls.setFont(new Font("shrif",Font.PLAIN,30));
ls.setForeground(Color.WHITE);
p3.add(ls);



l4.setBounds(20, 170, 250, 50);
l4.setFont(new Font("shrif",Font.PLAIN,20));
l4.setForeground(Color.WHITE);
p3.add(l4);
l5.setBounds(25, 200,100, 50);
l5.setForeground(Color.WHITE);
p3.add(l5);
t5.setBounds(110,215, 75, 20);
t5.setForeground(Color.CYAN);
p3.add(t5);
l6.setBounds(25, 230,120, 50);
l6.setForeground(Color.WHITE);
p3.add(l6);
t6.setBounds(140,245, 150, 20);
t6.setForeground(Color.CYAN);
p3.add(t6);




lu.setBounds(20, 260, 250, 50);
lu.setFont(new Font("shrif",Font.PLAIN,20));
lu.setForeground(Color.WHITE);
p3.add(lu);
l7.setBounds(25,290,100, 50);
l7.setForeground(Color.WHITE);
p3.add(l7);
t7.setBounds(110,305, 75, 20);
t7.setForeground(Color.CYAN);
p3.add(t7);
l8.setBounds(25, 320,120, 50);
l8.setForeground(Color.WHITE);
p3.add(l8);
t8.setBounds(140,335, 150, 20);
t8.setForeground(Color.CYAN);
p3.add(t8);




lk.setBounds(20, 350, 250, 50);
lk.setFont(new Font("shrif",Font.PLAIN,20));
lk.setForeground(Color.WHITE);
p3.add(lk);
l9.setBounds(25,380,100, 50);
l9.setForeground(Color.WHITE);
p3.add(l9);
t9.setBounds(110,395, 75, 20);
t9.setForeground(Color.CYAN);
p3.add(t9);
l10.setBounds(25, 410,120, 50);
l10.setForeground(Color.WHITE);
p3.add(l10);
t10.setBounds(140,425, 150, 20);
t10.setForeground(Color.CYAN);
p3.add(t10);




lt.setBounds(20,440, 250, 50);
lt.setFont(new Font("shrif",Font.PLAIN,20));
lt.setForeground(Color.WHITE);
p3.add(lt);
l11.setBounds(25,470,100, 50);
l11.setForeground(Color.WHITE);
p3.add(l11);
t11.setBounds(110,485, 75, 20);
t11.setForeground(Color.CYAN);
p3.add(t11);
l12.setBounds(25, 500,120, 50);
l12.setForeground(Color.WHITE);
p3.add(l12);
t12.setBounds(140,515, 150, 20);
t12.setForeground(Color.CYAN);
p3.add(t12);












b1.setBounds(250, 600, 70, 30);
p3.add(b1);
b1.addActionListener(e);

}

private class event implements ActionListener{

@Override
public void actionPerformed(ActionEvent e) {

if(e.getSource()==b1){
    SimpleRun.sort();
    double q=SimpleRun.heart_rate;
   
    
    double w=SimpleRun.sort[0].get_heart_rate();
    
  double o=SimpleRun.sort[1].get_heart_rate();
   // 
    double r=SimpleRun.sort[2].get_heart_rate();
 //   
    double y=SimpleRun.sort[3].get_heart_rate();
   // 
    
    
t2.setText(Integer.toString(SimpleRun.total_burnt));
t3.setText( h.format(q));

l4.setText(SimpleRun.sort[0].get_name());
t5.setText(Integer.toString(SimpleRun.sort[0].get_burnt()));
t6.setText(h.format(w));

lu.setText(SimpleRun.sort[1].get_name());
t7.setText(Integer.toString(SimpleRun.sort[1].get_burnt()));
t8.setText(h.format(o));

lk.setText(SimpleRun.sort[2].get_name());
t9.setText(Integer.toString(SimpleRun.sort[2].get_burnt()));
t10.setText(h.format(r));

lt.setText(SimpleRun.sort[3].get_name());
t11.setText(Integer.toString(SimpleRun.sort[3].get_burnt()));
t12.setText(h.format(y));


}

}




}






























}