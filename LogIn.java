import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogIn {
 public static void logIn(JFrame f, JButton b, JLabel l3, JLabel l, JLabel l2, JTextField tf, JPasswordField pf) {
  b.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
     String username = tf.getText();
     String password = new String(pf.getPassword());
     if (username.isEmpty() || password.isEmpty()) {
      l3.setText("Please fill the blank spots");
      l3.setForeground(Color.RED);
      l.setForeground(Color.RED);
      l2.setForeground(Color.RED);
     } else if (credentials.checkCredentials(username, password)) {
      FrameTwo.createFTwo();
      l3.setForeground(Color.BLACK);
      l.setForeground(Color.BLACK);
      l2.setForeground(Color.BLACK);
     } else {
      l3.setText("Invalid Username or Password");
      l3.setForeground(Color.RED);
     }
    }
  });
 }
}
