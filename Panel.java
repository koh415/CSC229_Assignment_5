import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

// class for the panel of my GUI
public class Panel extends JPanel {
  private AnimationTimer timer;
  private Robot r, r2d2;
  Image backgroundimage;

  // defaut constructor
  public Panel() {
    super();
    this.setSize(500, 500);
    this.setPreferredSize(new Dimension(500, 500));
    this.setBackground(Color.black);
    backgroundimage = new ImageIcon("space.jpg").getImage();
    timer = new AnimationTimer(this);
    timer.start();
    // create robot objects
    r = new Robot(200, 200, 500, 500);
    r2d2 = new Robot(100, 100, 500, 500);

  }
  // move method for robots
  public void move() {
    r.move(10, 0);
    r2d2.move(0, 5);
    this.repaint();
  }

  // paint component
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D brush = (Graphics2D) g;
    brush.drawImage(backgroundimage, 0, 0, null); 
    r.paint(brush);
    r2d2.paint(brush);
    
  } 
}