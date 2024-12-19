import javax.swing.*;
import java.awt.*;

public class MenuListAction {
 static Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
 static JButton img;
 public static void show(JPanel p, JList<String> list1) {
  if(list1.getSelectedIndex() == 0) {
  img =new JButton(new ImageIcon("love.jpg"));
  img.setBounds(
  screenSize.width*10/100 , //x
  screenSize.height*5/100, //y
  screenSize.width*70/100, //width
  screenSize.height*90/100); //height
  }
  else if(list1.getSelectedIndex() == 1) {
  img =new JButton(new ImageIcon("dog.jpg"));
  img.setBounds(
  screenSize.width*10/100 , //x
  screenSize.height*5/100, //y
  screenSize.width*70/100, //width
  screenSize.height*90/100); //height
  } 
  p.add(img);

 }
}
