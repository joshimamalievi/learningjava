import javax.swing.*;
import java.awt.*;

public class MenuList {
 public static void List(JPanel p, JPanel m) {
  final DefaultListModel<String> l1 = new DefaultListModel<>();  
   l1.addElement("Home");  
   l1.addElement("Financials");  
   l1.addElement("Information");  
   l1.addElement("Contact"); 
  final JList<String> list1 = new JList<>(l1);   
  list1.setFont(new Font("Arial", Font.PLAIN, 18));
  list1.setBackground(Color.RED);
  list1.setForeground(Color.WHITE);
  list1.setSelectedIndex(0);
  list1.setSelectionBackground(Color.WHITE);
  list1.setSelectionForeground(Color.RED);
  list1.setFixedCellHeight(50);
  list1.setFixedCellWidth(200); 

  MenuListAction.show(m, list1);

  p.add(list1);
 }
}
