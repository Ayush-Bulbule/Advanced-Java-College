import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame implements ActionListener {

  private JButton jb;
  private JLabel lbl, jlbl1, jlbl2;
  private JPasswordField jpass;
  private JTextField jtext;

  public MyFrame4() {
    ImageIcon imglbl = new ImageIcon("../images/user.png");
    JLabel lbl = new JLabel(imglbl);
    JFrame f = new JFrame("Practical No 1:19CM007");
    JLabel l2 = new JLabel("Password:");
    JLabel l1 = new JLabel("Roll No:");
    JButton btn = new JButton("See Result");
    JTextField rolltxt = new JTextField("");
    JPasswordField value = new JPasswordField();
    lbl.setBounds(50, 10, 120, 120);
    l1.setBounds(20, 150, 80, 30);
    l2.setBounds(20, 190, 80, 30);
    rolltxt.setBounds(100, 150, 100, 30);
    value.setBounds(100, 190, 100, 30);
    btn.setBounds(20, 240, 130, 30);
    f.add(lbl);
    f.add(value);
    f.add(l2);
    f.add(l1);
    f.add(rolltxt);
    f.add(btn);
    f.setSize(500, 500);
    f.setLayout(null);
    f.setVisible(true);
  }
}

// Any Desk Id: 740473409
password is : Gpamravati@123

public class j01Practical {

  public static void main(String[] args) {
    MyFrame4 f = new MyFrame4();
  }
}
