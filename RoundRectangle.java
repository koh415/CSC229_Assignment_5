import java.awt.Color;
 // class for rounded rectangles that extends the shape class
public class RoundRectangle extends Shape
{
  // default constructor 
  public RoundRectangle()
  {
    this(Color.BLUE);
    this.setSize(100,100);
    this.setLocation(10,10);
  }
  //  constructor w/ variable color
  public RoundRectangle(Color color)
  {
    super(new java.awt.geom.RoundRectangle2D.Double());
    this.setColor(color);
  }
}