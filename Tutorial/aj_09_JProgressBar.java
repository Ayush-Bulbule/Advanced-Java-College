// JProgressBar

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class MyFrame_9 extends JFrame implements ActionListener, Runnable {

  private JProgressBar pb;
  private JButton btn;
  private Canvas cnv;
  private JLabel lbl;
  private Graphics g;
  private Thread tr;
  private Random rnd;

  public MyFrame_9() {
    super("JProgressBar");
    //Button
    btn = new JButton("Start");
    this.add(btn, BorderLayout.NORTH);
    btn.addActionListener(this);

    cnv = new Canvas();
    this.add(cnv, BorderLayout.CENTER);

    JPanel pnl = new JPanel();
    this.add(pnl, BorderLayout.SOUTH);
    pnl.setLayout(new GridLayout(2, 1));

    lbl = new JLabel("0%", JLabel.CENTER);
    lbl.setFont(new Font("Calibri", Font.BOLD, 20));
    pnl.add(lbl);

    pb = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
    pb.setForeground(Color.GREEN);
    pnl.add(pb);
    setSize(400, 500);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    tr = new Thread(this);
    tr.start();
  }

  public void run() {
    g = cnv.getGraphics();
    Random rn = new Random();

    for (int i = 1; i <= 100; i++) {
      int x = rn.nextInt(450);
      int y = rn.nextInt(450);

      int z = rn.nextInt(100);

      float red = rn.nextFloat();
      float green = rn.nextFloat();
      float blue = rn.nextFloat();

      Color clr = new Color(red, green, blue);

      g.setColor(clr);
      g.fillOval(x, y, z, z);

      pb.setValue(i);
      double persent = pb.getPercentComplete() * 100;
      lbl.setText(String.format("%.2f", persent) + "%");

      try {
        Thread.sleep(100);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}

public class aj_09_JProgressBar {

  public static void main(String[] args) {
    MyFrame_9 mf = new MyFrame_9();
  }
}
