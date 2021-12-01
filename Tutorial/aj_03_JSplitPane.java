import javax.swing.*;

class MyFrame3 extends JFrame {

  private JSplitPane jsp;
  private JScrollPane sp1, sp2;
  private JLabel lbl1, lbl2;
  private ImageIcon img1, img2;

  public MyFrame3() {
    img1 = new ImageIcon("images/leaf.jpg");
    lbl1 = new JLabel(img1);
    sp1 = new JScrollPane(lbl1);
    img2 = new ImageIcon("images/garden.jpg");
    lbl2 = new JLabel(img2);
    sp2 = new JScrollPane(lbl2);

    jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sp1, sp2);

    jsp.setDividerLocation(250);
    jsp.setDividerSize(1);

    this.add(jsp);
    this.setSize(500, 500);

    this.setVisible(true);
  }
}

public class aj_03_JSplitPane {

  public static void main(String[] args) {
    MyFrame3 f = new MyFrame3();
  }
}
