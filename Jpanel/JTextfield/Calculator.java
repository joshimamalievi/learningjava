import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
 JTextField t1, t2, t3;
 JButton b1;
 JButton b2;
 Calculator() {
  t1 = new JTextField();
  t2 = new JTextField();
  t3 = new JTextField();
  b1 = new JButton("+");
  b2 = new JButton("-");
  t1.setBounds(50,50,150,50);
  t2.setBounds(50,100,150,50);
  t3.setBounds(50,150,150,50);
  t3.setEditable(false);
  b1.setBounds(50,200,150,50);
  b2.setBounds(250,200,150,50);
  b1.addActionListener(this);
  b2.addActionListener(this);
  add(t1);
  add(t2);
  add(t3);
  add(b1);
  add(b2);
  setSize(500, 500);
  setLayout(null);
  setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
  String s1 = t1.getText();
  String s2 = t2.getText();
  // Converting string inputs to integers  
  int a = Integer.parseInt(s1);  
  int b = Integer.parseInt(s2); 
  int c = 0;
  if (e.getSource() == b1) {
   c = a + b;
  } else if(e.getSource() == b2) {
   c = a - b;
  }
  String result = String.valueOf(c);
  t3.setText(result);
 }
 public static void main(String[] args) {
  new Calculator();
 }
}