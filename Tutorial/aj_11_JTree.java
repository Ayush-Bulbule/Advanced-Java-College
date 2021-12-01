// Roll NO:  19CM007 - Ayush Shashikant Bulbule

/* Write a Program in java  to create a JTree.   */
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class MyFrame extends JFrame {

  private JLabel lbl;
  private JTree tree;
  private DefaultMutableTreeNode tnIND, tnMH, tnRJ, tnCH;

  public MyFrame() {
    super("Practical 3: JTree");
    lbl = new JLabel("[]");
    lbl.setForeground(Color.RED);
    this.add(lbl, BorderLayout.NORTH);

    tnIND = new DefaultMutableTreeNode("India");
    tnMH = new DefaultMutableTreeNode("Maharashtra");
    tnIND.add(tnMH);
    tnRJ = new DefaultMutableTreeNode("Rajasthan");

    String str[] = { "Akola", "Pune", "Amravati", "Nagpur" };
    String str2[] = { "Ajmer", "Jaipur", "Udaipur", "Jaisalmer" };

    for (int i = 0; i < str.length; i++) {
      tnCH = new DefaultMutableTreeNode(str[i]);
      tnMH.add(tnCH);
    }
    for (int i = 0; i < str2.length; i++) {
      tnCH = new DefaultMutableTreeNode(str[i]);
      tnRJ.add(tnCH);
    }
    tnIND.add(tnRJ);

    tree = new JTree(tnIND);
    this.add(tree);
    this.setVisible(true);
    this.setSize(500, 500);
  }
}

public class Practical3 {

  public static void main(String[] args) {
    MyFrame f = new MyFrame();
  }
}
