import javax.swing.*; //directory for JPanel
import java.awt.event.*; // directory for actions

public class Main {
 public static void main(String[] args) {
  JFrame f=new JFrame("Button Example");  // this is a panel that opens up
  final JTextField tf=new JTextField(); // this is a text field 
  tf.setBounds(50,50, 150,20);  // this sets boundaries for tf
  JButton b=new JButton("Click Here");  // this is a button
  b.setBounds(50,100,95,30);  // this is the btn boundaries
  b.addActionListener(new ActionListener(){  
      public void actionPerformed(ActionEvent e){  
          tf.setText("FUCK OFF MF"); // this is how to set an action to clicked button and writes this on the textfield after you click on it
      }  
  });  
  f.add(b);f.add(tf);  // this adds the button and tf to the panel
  f.setSize(1980, 1260); //size of the panel
  f.setLayout(null);
  f.setVisible(true); //opens the panel
 }
 
}