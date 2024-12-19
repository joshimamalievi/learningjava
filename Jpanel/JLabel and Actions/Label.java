import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Label extends Frame implements ActionListener{
 JTextField tf; JButton b; JLabel l;
  Label(){
  tf = new JTextField();
  tf.setBounds(50, 50, 150, 20);
  b = new JButton("Find IP");
  b.setBounds(50, 100, 150, 50);
  l = new JLabel();
  l.setBounds(0, 150, 400, 20);
  b.addActionListener(this);
  add(b);add(l);add(tf);
  setSize(400, 400);
  setLayout(null);
  setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
  try {
   String host = tf.getText();// gets the name
   String ip = java.net.InetAddress.getByName(host).getHostAddress();// get the ip adress
   l.setText("Ip of " + host + " is: " + ip);
  }catch(Exception ex){System.out.println(ex);}  
 }
 public static void main(String[] args) {
  new Label();
 }
 
}