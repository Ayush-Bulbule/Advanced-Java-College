import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame3a extends JFrame implements ActionListener {

  private JButton jb1, jb2;

  public MyFrame3a() {
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
    String caption = e.getActionCommand();
    if (caption.equals("Frist")) {
      JOptionPane.showMessageDialog(this, "First Button Clicked!!");
    } else {
      JOptionPane.showMessageDialog(this, "Second Button CLicked!");
    }
  }
}

public class aj_03_JButton2 {

  public static void main(String[] args) {
    MyFrame3b f = new MyFrame3b();
  }
}
