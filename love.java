import javax.swing.*;

public class love extends JPanel {
    public static String lastUsername = "";
    public static String lastPassword = "";
    private static JFrame f = new JFrame("Password Field Example");

    public static void main(String[] args) {
        JPasswordField pf = new JPasswordField();
        JTextField tf = new JTextField();
        JLabel l = new JLabel("Password: ");
        JLabel l2 = new JLabel("Username: ");
        JButton b = new JButton("Log in");
        JButton b2 = new JButton("Sign up");
        JLabel l3 = new JLabel();
        l3.setBounds(20, 200, 300, 30);
        b.setBounds(100, 150, 100, 30);
        b2.setBounds(200, 150, 100, 30);
        tf.setBounds(100, 50, 200, 30);
        l2.setBounds(20, 50, 80, 30);
        l.setBounds(20, 100, 80, 30);
        pf.setBounds(100, 100, 200, 30);
        f.add(pf);
        f.add(l);
        f.add(l2);
        f.add(tf);
        f.add(b);
        f.add(b2);
        f.add(l3);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SignUp.signUp(b2, tf, pf, f, l3);
        
        LogIn.logIn(f, b, l3, l3, l2, tf, pf);   
    }
}
