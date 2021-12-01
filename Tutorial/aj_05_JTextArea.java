package Tutorial;

import java.awt.*;
import javax.swing.*;
import javax.swing.JTextArea;

public class aj_05_JTextArea {

  public static void main(String[] args) {
    Frame f = new Frame();
  }
}

class Frame extends JFrame {

  public Frame() {
    super("JTextArea");
    this.setLayout(new FlowLayout());
    this.getContentPane().setBackground(Color.YELLOW);

    JTextArea ta = new JTextArea();
    ta.setRows(5);
    this.add(ta);

    this.setVisible(true);
    this.setSize(300, 200);
  }
}
