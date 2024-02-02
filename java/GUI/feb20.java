package GUI;



/*
 * Gui application
 * collection of windows -JFrame
 * JFrame is a class -->javax.swing
 * 
 * EX:
 * import javax.swing.JFrame;
 * class FirstFrame
 * {
 * psvm(...)
 * {
 * JFrame frame=new JFrame();
 * frame.setVisible(true);
 * }
 * }
 */
import javax.swing.JFrame;
  class FirstFrame
  {
  public static void main(String[] args) {
    {
        JFrame frame=new JFrame();
        frame.setVisible(true);
       }
    
  }
  
 }
 class FirstFrame extends JFrame
 {
    public static void main(String[] args) {
        new FirstFrame();
        FirstFrame()
        {
            this.setSize(600,500);
            this.setTitle("My first Frame");
            this.setVisible(true);
        }
    }
 }
 class Button extends JFrame
 {
    public static void main(String[] args) {
     Button frame =new Button();
        {
            frame.setSize(600,500);
            frame.setTitle("Button");
            frame.setVisible(true);
        }
    }

    
 }