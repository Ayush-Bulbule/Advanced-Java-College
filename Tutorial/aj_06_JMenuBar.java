// JMenuBar
// An object of this class represents a menubar in which we can add menus. This class is available in the package javax.swing

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JMenuItem;

class MyFrame_6 extends JFrame implements ActionListener {

  private JMenuBar mb;
  private JMenu file_menu, edit_menu;
  private JMenuItem mi;
  private JTextArea ta;
  private JScrollPane jsp;
  private JFileChooser jfc;

  public MyFrame_6() {
    super("NotePad");
    mb = new JMenuBar();
    this.setJMenuBar(mb);

    file_menu = new JMenu("File");
    edit_menu = new JMenu("Edit");

    //File Menu
    mb.add(file_menu);
    String arr[] = { "New", "Save", "Open", "Exit" };
    String images[] = {
      "images/p_new.png",
      "images/p_save.png",
      "images/p_open.png",
      "images/p_close.png",
    };
    for (int i = 0; i < arr.length; i++) {
      if (i == 3) {
        file_menu.addSeparator();
      }
      mi = new JMenuItem(arr[i], new ImageIcon(images[i]));
      file_menu.add(mi);
      mi.addActionListener(this);
    }

    //Edit Menu
    mb.add(edit_menu);
    String ed_arr[] = { "Copy", "Cut", "Paste" };
    String ed_images[] = {
      "images/p_copy.png",
      "images/p_cut.png",
      "images/p_paste.png",
    };
    for (int i = 0; i < ed_arr.length; i++) {
      mi = new JMenuItem(ed_arr[i], new ImageIcon(ed_images[i]));
      edit_menu.add(mi);
      mi.addActionListener(this);
    }

    //Text Area
    ta = new JTextArea();
    ta.setFont(new Font("Calibri", Font.BOLD, 22));
    jsp = new JScrollPane(ta);
    this.add(jsp, BorderLayout.CENTER);

    this.setSize(800, 600);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    String caption = e.getActionCommand();

    if (caption.equals("New")) {
      ta.setText("");
    } else if (caption.equals("Open")) {} else if (caption.equals("Save")) {
      try {
        int result = jfc.showSaveDialog(this);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    } else if (caption.equals("Exit")) {
      this.dispose();
    } else if (caption.equals("Cut")) {
      ta.cut();
    } else if (caption.equals("Copy")) {
      ta.copy();
    } else if (caption.equals("Paste")) {
      ta.paste();
    }
  }
}

public class aj_06_JMenuBar {

  public static void main(String[] args) {
    MyFrame_6 mb = new MyFrame_6();
  }
}
