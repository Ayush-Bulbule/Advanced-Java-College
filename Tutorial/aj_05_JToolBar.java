import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

class MyFrame_5 extends JFrame implements ActionListener {

  private JToolBar tbar;
  private JScrollPane jsp;
  private JTextArea ta;
  private JButton b;

  public MyFrame_5() {
    super("Compilers");
    tbar = new JToolBar(JToolBar.HORIZONTAL);
    this.add(tbar, BorderLayout.NORTH);
    tbar.setFloatable(false);
    tbar.setLayout(new GridLayout(1, 3));
    tbar.setSize(500, 80);
    String str[] = { "CUT", "COPY", "PASTE" };
    String images[] = {
      "./images/cut.png",
      "./images/copy.png",
      "./images/paste.png",
    };

    for (int i = 0; i < str.length; i++) {
      b = new JButton(str[i]);
      b.setIcon(new ImageIcon(images[i]));
      b.addActionListener(this);
      tbar.add(b);
    }
    ta = new JTextArea();
    jsp = new JScrollPane(ta);
    this.add(jsp, BorderLayout.CENTER);
    ta.setFont(new Font("Gabriola", Font.BOLD + Font.ITALIC, 30));

    this.setVisible(true);
    this.setSize(500, 500);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    String caption = e.getActionCommand();

    if (caption.equals("CUT")) {
      ta.cut();
    } else if (caption.equals("COPY")) {
      ta.copy();
    } else if (caption.equals("PASTE")) {
      ta.paste();
    }
  }
}

public class aj_05_JToolBar {

  public static void main(String[] args) {
    MyFrame_5 mf = new MyFrame_5();
  }
}
