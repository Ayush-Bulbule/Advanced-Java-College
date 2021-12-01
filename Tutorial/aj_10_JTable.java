import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import javax.swing.table.JTableHeader;

class MyFrame_10 extends JFrame implements ActionListener {

  private JTable tbl;
  private JScrollPane sp;

  public MyFrame_10() {
    String rows[][] = {
      { "1111", "Jack", "CSE" },
      { "1122", "Tom", "CSE" },
      { "1133", "John", "CSE" },
      { "1144", "Mary", "CSE" },
      { "1155", "Peter", "CSE" },
    };
    String cols[] = { "ID", "Name", "Dept" };

    tbl = new JTable(rows, cols);

    JScrollPane sp = new JScrollPane(tbl);
    add(sp);
    // this.add(sp, BorderLayout.CENTER);
    // this.add(tbl, BorderLayout.CENTER);
    JTableHeader th = tbl.getTableHeader();
    th.setBackground(Color.PINK);
    th.setForeground(Color.BLUE);

    setTitle("JTable");
    setVisible(true);
    setSize(600, 600);
  }

  @Override
  public void actionPerformed(ActionEvent e) {}
}

public class aj_10_JTable {

  public static void main(String[] args) {
    MyFrame_10 mf = new MyFrame_10();
  }
}
