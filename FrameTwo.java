import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
public class FrameTwo extends JPanel {
 static Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
 static JFrame f1 = new JFrame("Personal Page");
 static JPanel navbar = new JPanel();
  
 public static void createFTwo() {
  JPanel menu = new JPanel();
  JPanel main = new JPanel();
  
  menu.setBounds(0, 
  screenSize.height*5/100, 
  (screenSize.width*20)/100, 
  (screenSize.height*95)/100);
  menu.setBackground(Color.RED);
  
  
  navbar.setBounds(0, 0,screenSize.width, (screenSize.height*5)/100);
  navbar.setBackground(Color.BLUE);
  
  
  main.setBounds(screenSize.width*20/100, screenSize.height*5/100, screenSize.width*80/100, screenSize.height*95/100);
  main.setBackground(Color.GREEN);


  MenuItem.Menu(f1, navbar);
  MenuList.List(menu, main);
  
  
  
  f1.add(main);
  f1.add(menu);
  f1.add(navbar);
  
  
  
  f1.setSize(screenSize);
  f1.setLayout(null);
  f1.setVisible(true);
 }
}
