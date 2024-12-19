import java.awt.*;

import javax.swing.*;

public class MenuItem {
  static Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
  static JMenuBar mb = new JMenuBar();
  static JMenu file, edit, help;
  static JMenuItem cut,copy,paste,selectAll;
  public static void Menu(JFrame f, JPanel p) {
  
  file = new JMenu("File");
  edit = new JMenu("Edit");
  help = new JMenu("Help");

  cut = new JMenuItem("cut");
  copy=new JMenuItem("copy");    
  paste=new JMenuItem("paste");    
  selectAll=new JMenuItem("selectAll"); 

  mb=new JMenuBar();    
  file=new JMenu("File");    
  edit=new JMenu("Edit");    
  help=new JMenu("Help");
  mb.setSize(screenSize.width, (screenSize.height*5)/100);
  mb.setBackground(Color.BLUE);
  mb.setForeground(Color.WHITE);

  edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);    
  mb.add(file);mb.add(edit);mb.add(help); 

  p.add(mb);
  f.setJMenuBar(mb);
 }   
}
