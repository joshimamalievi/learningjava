import javax.swing.*;
import java.awt.event.*;

public class Main extends JPanel {

 public static void main(String[] args) {
  JFrame f = new JFrame("JUMP SCRAE" );
  JButton b = new JButton("CLICK ME MARTINA");
  JButton i = new JButton(new ImageIcon("java\\img.jpg"));
  i.setSize(828, 811);
  b.setBounds(100, 100, 200,100);
  b.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    f.add(i);
    f.remove(b);
   }
  });
  f.add(b);
  f.setSize(828, 811);
  f.setLayout(null);
  f.setVisible(true);
 }
}