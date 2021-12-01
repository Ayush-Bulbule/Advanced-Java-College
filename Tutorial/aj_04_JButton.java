import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

class MyFrame4 extends JFrame implements ActionListener {

  private JButton jb;

  public MyFrame4() {
    ImageIcon img = new ImageIcon("images/copy.png");
    jb = new JButton("Copy", img);

    jb.addActionListener(this);

    this.add(jb, BorderLayout.SOUTH);
    this.setVisible(true);
    this.setSize(500, 500);
  }

  public void actionPerfored(ActionEvent e) {}

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    JOptionPane.showMessageDialog(this, "Welocme here!");
  }
}

public class aj_04_JButton {

  public static void main(String[] args) {
    MyFrame4 f = new MyFrame4();
  }
}
