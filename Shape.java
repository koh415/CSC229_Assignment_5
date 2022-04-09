import java.awt.Color;
import java.awt.geom.*;
import java.awt.Graphics2D;

// abstract class for shapes
public abstract class Shape
{
  
  private RectangularShape shape;
  private Color fcolor, bcolor;
  private double rotation;
  
  // constructor
  public Shape(RectangularShape shape)
  {
    this.shape = shape;
    rotation = 0;
  }
  // setters
  // setter for location
  public void setLocation(double x, double y)
  {
    shape.setFrame(x, y, shape.getWidth(), shape.getHeight());
  }
  // setter for size
  public void setSize(double w, double h)
  {
    shape.setFrame(shape.getX(), shape.getY(), w, h);
  }
  // setter for fill color
  public void setFillColor(Color color)
  {
    this.fcolor = color;
  }
  // setter for border color
  public void setBorderColor(Color color)
  {
    this.bcolor = color;
  }
  // setter for color 
  public void setColor(Color color)
  {
    this.fcolor = color;
    this.bcolor = color;
  }
  // setter for roation
  public void setRotaion(double degrees)
  {
    rotation = degrees * Math.PI / 180;
  }
  // getters for Shape
  // getter for X
  public double getX()
  {
    return shape.getX();
  }
  // getter for Y
  public double getY()
  {
    return shape.getY();
  }
  // getter for fill color
  public Color getFillColor()
  {
    return fcolor;
  }
  // getter for border color
  public Color getBorderColor()
  {
    return bcolor;
  }
  // getter for rotation
  public double getRotation()
  {
    return rotation * Math.PI / 180;
  }
  // paint method
  public void paint(Graphics2D brush)
  {
    brush.rotate(rotation, shape.getCenterX(), shape.getCenterY());
    brush.setColor(bcolor);
    brush.draw(shape);
    brush.setColor(fcolor);
    brush.fill(shape);
    brush.rotate(0-rotation, shape.getCenterX(), shape.getCenterY());
  }
  
} 