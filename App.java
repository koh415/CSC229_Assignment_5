import javax.swing.JFrame;
// App clas for GUI
public class App extends JFrame
{
  // default constructor
  public App()
  {
    super("Two Robots!");
    this.setSize(550,550);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    Panel panel = new Panel();
    this.add(panel);
    this.setVisible(true);
    
  }
}