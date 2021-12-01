// Differenct between AWT And Swing
import java.awt.*;
import javax.swing.*;
class aj_01_SwingIntro {

  public static void main(String[] args) {
    // AWT
      Frame f = new Frame("AWT Frame");
      f.setVisible(true);
      f.setSize(500,500);

      // Swing
      JFrame jf = new JFrame("Swing Frame");
      jf.setVisible(true);
      jf.setSize(500,500);
  }
}
