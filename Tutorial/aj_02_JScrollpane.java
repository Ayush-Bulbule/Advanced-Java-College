import java.awt.BorderLayout;

import javax.swing.*;


class MyFrame2 extends JFrame{
    private JLabel lbl;
    private JScrollPane sp;

    public MyFrame2(){
        // this.setBackground(Colors.YELLOW);
        ImageIcon img = new ImageIcon("images/ayush.png");

        lbl = new JLabel(img);
        sp = new JScrollPane(lbl);

        this.add(sp,BorderLayout.CENTER);
        this.setVisible(true);
        this.setSize(500,500);
    }
}

public class aj_02_JScrollpane {
    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2();
    }
}
