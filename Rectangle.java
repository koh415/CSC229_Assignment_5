import java.awt.Color;
// class for rectangles that extends shape
public class Rectangle extends Shape{
  // default constructor
  public Rectangle()
  {
    this(Color.black);
    this.setSize(100,100);
    this.setLocation(200,200);
  }
  // constructor w/ color variable
  public Rectangle(Color color){
    super(new java.awt.geom.Rectangle2D.Double());
    this.setColor(color);
  }    
}