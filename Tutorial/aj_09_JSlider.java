//JSlider: - JSlider is a component that lets the user select a value from a range of values.
//JSlider Constructor: JSlider(int min, int max, int value)

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame_8_1 extends JFrame implements ChangeListener {

  private JLabel lbl;
  private JSlider jsl;

  public MyFrame_8_1() {
    super("JSlider");
    //Label
    lbl = new JLabel("Compilerts", JLabel.CENTER);
    this.add(lbl, BorderLayout.CENTER);
    lbl.setFont(new Font("Sans-Serif", Font.BOLD, 20));

    //Slider
    jsl = new JSlider(JSlider.HORIZONTAL, 0, 100, 30);
    // Methods
    jsl.setMinorTickSpacing(1);
    jsl.setMajorTickSpacing(10);
    jsl.setPaintTicks(true);
    jsl.setPaintLabels(true);

    jsl.addChangeListener(this);
    this.add(jsl, BorderLayout.SOUTH);

    setSize(600, 400);
    setVisible(true);
  }

  @Override
  public void stateChanged(ChangeEvent e) {
    // TODO Auto-generated method stub
    lbl.setFont(new Font("Sans-Serif", Font.BOLD, jsl.getValue()));
    lbl.setText("Compilers " + jsl.getValue());
  }
}

public class aj_09_JSlider {

  public static void main(String[] args) {
    MyFrame_8_1 f = new MyFrame_8_1();
  }
}
