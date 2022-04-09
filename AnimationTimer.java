import javax.swing.*;
import java.awt.event.*;
// Animation timer for robots
public class AnimationTimer extends javax.swing.Timer {
  private Panel Panel;

  public AnimationTimer(Panel panel) {
    super(100, null);
    this.addActionListener(new MyMoveListener());
    Panel = panel;
  }

  private class MyMoveListener implements java.awt.event.ActionListener {
    public void actionPerformed(java.awt.event.ActionEvent e) {
      Panel.move();
    }
  }
}