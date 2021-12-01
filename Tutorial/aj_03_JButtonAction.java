import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame3b extends JFrame implements ActionListener {

  private JButton jb1, jb2;

  public MyFrame3b() {
    jb1 = new JButton("Frist");
    this.add(jb1, BorderLayout.NORTH);
    jb1.addActionListener(this);

    jb2 = new JButton("Second");
    this.add(jb2, BorderLayout.SOUTH);
    jb2.addActionListener(this);

    this.setVisible(true);
    this.setSize(500, 500);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    Object obj = e.getSource();

    if (obj == jb1) {
      JOptionPane.showMessageDialog(this, "Button 1 Clicked");
    } else if (obj == jb2) {
      JOptionPane.showMessageDialog(this, "Button 2 Clicked");
    }
  }
}

public class aj_03_JButtonAction {

  public static void main(String[] args) {
    MyFrame3b f = new MyFrame3b();
  }
}
