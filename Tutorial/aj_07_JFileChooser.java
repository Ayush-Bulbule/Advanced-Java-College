// JMenuBar
// An object of this class represents a menubar in which we can add menus. This class is available in the package javax.swing

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.*;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

class MyFrame_7 extends JFrame implements ActionListener {

  private JMenuBar mb;
  private JMenu file_menu, edit_menu;
  private JMenuItem mi;
  private JTextArea ta;
  private JScrollPane jsp;
  private JFileChooser jfc;

  public MyFrame_7() {
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

    jfc = new JFileChooser("E:/SemV");
    String file_Types[] = {
      "C Files",
      "C++ Files",
      "Java Files",
      "Text Files",
    };
    String file_Extension[] = { "c", "cpp", "java", "txt" };

    for (int i = 0; i < file_Types.length; i++) {
      FileNameExtensionFilter filter = new FileNameExtensionFilter(
        file_Types[i],
        file_Extension[i]
      );
      jfc.setFileFilter(filter);
    }

    this.setSize(800, 600);
    this.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    String caption = e.getActionCommand();

    if (caption.equals("New")) {
      ta.setText("");
    } else if (caption.equals("Open")) {
      try {
        int result = jfc.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
          //open file and get data
          File f = jfc.getSelectedFile();
          FileInputStream fin = new FileInputStream(f);
          int file_size = fin.available();
          byte arr[] = new byte[file_size];
          fin.read(arr);
          fin.close();
          String file_data = new String(arr);
          ta.setText(file_data);
        } else if (result == JFileChooser.CANCEL_OPTION) {
          //cancel
        }
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    } else if (caption.equals("Save")) {
      try {
        int result = jfc.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
          String data = ta.getText();
          File f = jfc.getSelectedFile();

          FileOutputStream fout = new FileOutputStream(f);
          byte arr[] = data.getBytes();
          fout.write(arr);
          fout.close();

          JOptionPane.showMessageDialog(this, "File Saved!");
        } else if (result == JFileChooser.CANCEL_OPTION) {}
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

public class aj_07_JFileChooser {

  public static void main(String[] args) {
    MyFrame_7 mb = new MyFrame_7();
  }
}
