import javax.swing.*;

public class MenuListAction {
 public static void show(JPanel m, JList<String> list1) {
  list1.addListSelectionListener(e -> {
    if (!e.getValueIsAdjusting()) {
        String selectedValue = list1.getSelectedValue();
        switch (selectedValue) {
            case "Home":
                showPanel(m, new HomePanel());
                break;
            case "Financials":
                showPanel(m, new FinancialsPanel());
                break;
            case "Information":
                showPanel(m, new InformationPanel());
                break;
            case "Contact":
                showPanel(m, new ContactPanel());
                break;
        }
    }
});
}

public static void showPanel(JPanel m, JPanel newPanel) {
m.removeAll();
m.add(newPanel);
m.revalidate();
m.repaint();
}
}

class HomePanel extends JPanel {
public HomePanel() {
    add(new JButton(new ImageIcon("love.jpg")));
}
}

class FinancialsPanel extends JPanel {
public FinancialsPanel() {
    add(new JButton(new ImageIcon("dog.jpg")));
}
}

class InformationPanel extends JPanel {
public InformationPanel() {
    add(new JButton(new ImageIcon("tele.jpg")));
}
}

class ContactPanel extends JPanel {
public ContactPanel() {
    add(new JButton(new ImageIcon("moaning.jpg")));
}
}
