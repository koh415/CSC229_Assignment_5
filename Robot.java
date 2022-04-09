import java.awt.Color;
import java.awt.Graphics2D;

public class Robot
{
  // robot variables 
  private RoundRectangle body;
  private Rectangle rarm, larm, rleg, lleg;
  private Ellipse head, leye, reye;
  private double robotX, robotY;
  private int dpHeight, dpWidth;
  // constructor
  
  public Robot(double x, double y, int dpHeight, int dpWidth)
  {
    this.dpHeight = dpHeight;
    this.dpWidth = dpWidth;
    // set color
    body = new RoundRectangle(Color.GRAY);
    rarm = new Rectangle(Color.GRAY);
    larm = new Rectangle(Color.GRAY);
    rleg = new Rectangle(Color.GRAY);
    lleg = new Rectangle(Color.GRAY);
    head = new Ellipse(Color.GRAY);
    leye = new Ellipse(Color.black);
    reye = new Ellipse(Color.black);
    // set size
    body.setSize(100,100);
    rarm.setSize(25,50);
    larm.setSize(25,50);
    rleg.setSize(25,50);
    lleg.setSize(25,50);
    head.setSize(75,75);
    leye.setSize(10,15);
    reye.setSize(10,15);

    //set location
    this.setLocation(x,y);
    
  }
  // set new location for robot, and build it.
  public void setLocation(double x, double y)
  {
    double NewX = (x + dpWidth) % dpWidth;
    double NewY = (y + dpHeight) % dpHeight;
    this.robotX = NewX;
    this.robotY = NewY;

    // location of body and parts
    body.setLocation(NewX, NewY);
    rarm.setLocation(NewX + 100, NewY + 20);
    larm.setLocation(NewX - 25, NewY + 20);
    rleg.setLocation(NewX + 70, NewY + 100);
    lleg.setLocation(NewX + 10, NewY + 100);
    head.setLocation(NewX + 15, NewY - 70);
    leye.setLocation(NewX + 30, NewY - 50);
    reye.setLocation(NewX + 50, NewY - 50);
    
    
  }
  // move method for robot
  public void move(double dx, double dy)
  {
    this.setLocation(robotX + dx, robotY + dy);
  }
  // paint method
  public void paint(Graphics2D brush)
  {
    body.paint(brush);
    rarm.paint(brush);
    larm.paint(brush);
    rleg.paint(brush);
    lleg.paint(brush);
    head.paint(brush);
    leye.paint(brush);
    reye.paint(brush);
  }   
}