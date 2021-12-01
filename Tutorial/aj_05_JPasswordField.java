import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame extends JFrame implements ActionListener {

  private JLabel l1, l2, l3;
  private JTextField t1;
  private JPasswordField p1;
  private JButton jb1;

  public Frame() {
    super("Login Window");
    this.setLayout(new GridLayout(3, 2));

    l1 = new JLabel("Username");
    this.add(l1);
    t1 = new JTextField();
    this.add(t1);
    l2 = new JLabel("Password");
    this.add(l2);

    p1 = new JPasswordField();
    this.add(p1);
    p1.setEchoChar('#');

    jb1 = new JButton("Login");
    this.add(jb1);
    jb1.addActionListener(this);

    l3 = new JLabel();
    this.add(l3);

    this.setVisible(true);
    this.setSize(300, 200);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String username = t1.getText();
    char password[] = p1.getPassword();

    String pass = new String(password);

    if (username.equals("admin") && pass.equals("super")) {
      l3.setOpaque(true);
      l3.setForeground(Color.GREEN);
      l3.setText("Login Successfull!");
    } else {
      l3.setOpaque(true);
      l3.setForeground(Color.RED);
      l3.setText("Login Failed!!");
    }
  }
}

public class aj_05_JPasswordField {

  public static void main(String[] args) {
    Frame f = new Frame();
  }
}
