import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SignUp {
 public static void signUp(JButton b2, JTextField tf, JPasswordField pf, JFrame f, JLabel l3) {
  b2.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    String us = tf.getText();
    String pass = new String(pf.getPassword());
    if (us.isEmpty() || pass.isEmpty()) {
     l3.setText("Please fill the blank spots");
     l3.setForeground(Color.RED);
    } else if(credentials.sameUsername(us)) {
     JOptionPane.showMessageDialog(f, "This username is already used.");
     l3.setText("");
    }
    else {
     love.lastUsername = us;
     love.lastPassword = pass;
     Savetofile.saveToFile(love.lastUsername, love.lastPassword);
     l3.setText("Sign up successful!");
     l3.setForeground(Color.BLACK);
    }
   }
  });
 }
}
