package JavaEditorPnae;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import java.net.URL;



public class JFrameDemo extends JFrame {
 public JFrameDemo(String title) throws HeadlessException {
  super(title);
  //Sample 01: size and position
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  setBounds(0, 0, screenSize.width, screenSize.height);
  Container ControlHost = getContentPane();
  ControlHost.setLayout(new FlowLayout());

  //Sample 02: Create Editor Pane
  JEditorPane jep = new JEditorPane();
  jep.setEnabled(true);

  //Sameple 03: Create Scroll Pane
  JScrollPane scroll = new JScrollPane(jep);
  Dimension ScrollSize = new Dimension(getSize());
  scroll.setPreferredSize(ScrollSize);
  scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
  ControlHost.add(scroll);

  //Sample 04: Find the HTML File
  URL HtmlPage = JFrameDemo.class.getResource("html_css\\index.html");
  try {
   jep.setPage(HtmlPage);
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
