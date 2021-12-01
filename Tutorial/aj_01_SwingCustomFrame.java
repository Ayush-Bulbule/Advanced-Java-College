import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * aj_01_SwingCustomFrame
 */

 class MyFrame extends JFrame{
     private JLabel lbl;

     public MyFrame(){
         ImageIcon img = new ImageIcon("images/ayush.png");
         lbl = new JLabel(img);
         this.add(lbl,BorderLayout.CENTER);
         this.setVisible(true);
         this.setSize(500,500);
     }
 }
class aj_01_SwingCustomFrame {

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}