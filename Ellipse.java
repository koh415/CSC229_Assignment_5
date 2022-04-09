import java.awt.Color;

// class for ellipses that extends my abstract shape class
public class Ellipse extends Shape
{
  // default constructor
  public Ellipse()
  {
    this(Color.black);
    this.setSize(100,100);
    this.setLocation(100,100);
  }
  // constructor w/ variable color
  public Ellipse(Color color)
  {
    super(new java.awt.geom.Ellipse2D.Double());
    this.setColor(color);    
  }
}