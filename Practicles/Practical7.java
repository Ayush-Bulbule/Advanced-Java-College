/* 
Write a Program to demonstrate the various Mouse events using MouseListener
and MouseMotionListener Interface.
*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* 
<applet code="Practical7" width=500 height=500>
</applet>
*/
public class Practical7 extends Applet implements MouseListener {

  private Label lbl, lbl_status;
  private Canvas cnv;

  public Practical7() {
    //Label

    lbl = new Label("Practical 7: MouseListener", Label.CENTER);
    lbl.setBounds(100, 30, 400, 30);
    lbl.setFont(new Font("Calibri", Font.BOLD, 23)); //Canvas
    cnv = new Canvas();
    cnv.setBounds(0, 120, 500, 380);
    this.add(cnv, BorderLayout.CENTER);
    //
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mousePressed(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseReleased(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseEntered(MouseEvent e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void mouseExited(MouseEvent e) {
    // TODO Auto-generated method stub

  }
}
