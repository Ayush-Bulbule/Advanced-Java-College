// JColorChooser - A class that displays a color chooser dialog.
//Constructor -> JColorChooser(Color initialColor)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame_8 extends JFrame implements ActionListener {

  private JLabel lbl;
  private JButton b;
  private JColorChooser jc;

  public MyFrame_8() {
    super("JColorChooser");
    //Label
    lbl = new JLabel("Compilers", JLabel.CENTER);
    lbl.setFont(new Font("Sans-Serif", Font.BOLD, 48));
    this.add(lbl, BorderLayout.CENTER);

    //Button
    b = new JButton("Choose the Color");
    this.add(b, BorderLayout.SOUTH);
    b.addActionListener(this);

    //JColorChooser
    jc = new JColorChooser();

    this.setVisible(true);
    this.setSize(600, 400);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    String caption = e.getActionCommand();

    if (caption.equals("Choose the Color")) {
      Color c = jc.showDialog(this, "Choose Text Color", Color.BLACK);
      lbl.setForeground(c);
    }
  }
}

public class aj_08_JColorChooser {

  public static void main(String[] args) {
    MyFrame_8 f = new MyFrame_8();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
