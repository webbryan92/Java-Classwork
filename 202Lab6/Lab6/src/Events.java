
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Events extends JFrame {

    public Events() {
       //add a new Panel object to this JFrame
        add(new Panel());
    }

    public static void main(String[] args) {
        JFrame frame = new Events();
        frame.setTitle("Circle Draw");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null); // Center the frame on current Window
        frame.setVisible(true);
    }
}

class Panel extends JPanel implements KeyListener, MouseMotionListener, ActionListener// this should inherit JPanel, and implement  KeyListener, MouseMotionListener, ActionListener
{
    // two of the methods that belong to two of these listeners are missing in the program, you must add those methods first. 
    
    // Go to Java API(OnCourse has a link) and look at each listener class to figure out the missing methods.

    // declare a Circle Object called c
    Circle c;
    // declare an int variable x for bounding square 
    // declare an int variable y for bounding square 
    int x , y;
    // declare a new JButton called jbt
    JButton jbt;
    boolean go = false;

    public Panel() {
        super();
        this.requestFocusInWindow();
        // instantiate Circle Object c with radius of 20
        c = new Circle(20);
	// instantiate JButton with a label "Press to Draw"
        jbt = new JButton("Press to Draw");
        jbt.addActionListener(this); //What is the purpose of addActionListener method call here? Add a listener for an action(button press for a button)
        this.add(jbt, BorderLayout.NORTH); 
        this.addKeyListener(this); //What is the purpose of addKeyListener method call here? Add a listener to capture key presses
        this.addMouseMotionListener(this); //What is the purpose of addMouseMotionListener method call here? Add a listener to capture mouse movement.

    }

    //Which listener interface force us to implement this actionPerformed method? KeyListener
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == jbt) { 
            go = true;
	    repaint(); // Why do we need to call repaint here? By default there is no circle visible and you must show the new circle.
        }
        this.requestFocusInWindow(true); // What is the consequence of not having this method call? Requests the ability to focus user inputs to the window.
    }

    // What does the paintComponent method do?   Calculates the radius and paints the oval with default parameters.
    @Override
    public void paintComponent(Graphics g) { 
        //call parent's panitComponent method, make sure to pass argument g to it.
        super.paintComponent(g);
        // get the radius of Circle c and store it in variable rad.
        int rad = (int)(c.getRadius());
        if (!go) { // Why do I check if go is false? if nothing is drawn 
            x = (int) (getWidth() / 2.0 - rad); // What does getWidth method return? width of the Jpanel
            y = (int) (getHeight() / 2.0 - rad);// What does getHeight method return? height of the Jpanel
        }

        if (go) { // Why do I check if go is true? Because the first if is not go, so you have to check if go is true otherwise it would run regardless
            g.drawOval(x, y, (int) rad * 2, (int) rad * 2); // What class drawOval belong to? Name another two methods in this same class. Graphics class, drawRectangle drawLine
        }
    }

    public void keyTyped(KeyEvent e) { // empty implementation
    }

    //Which listener interface force us to implement this keyPressed method? KeyListener
    public void keyPressed(KeyEvent e) { 

        switch (e.getKeyCode()) { // What does getKeyCode method return? the value of the key pressed
            case KeyEvent.VK_DOWN: { 
                c.setRadius(c.getRadius() - 1); 
                break;
            }
            case KeyEvent.VK_UP: {
                c.setRadius(c.getRadius() + 1);
                break;
            }
        }
        go = true;
        repaint(); // Why do we need this repaint() method here? to repaint the circle with the new radius
    }

   
    //Which listener interface force us to implement this mouseDragged method? mouseListener
    public void mouseDragged(MouseEvent e) { 
        if (insideCircle(e.getX(), e.getY())) { //What does getX and getY methods return? position of the mouse cursor
            x = e.getX() - (int)c.getRadius();
            y = e.getY() - (int)c.getRadius();
            go = true;
            repaint();
        }
    }

    
    public boolean insideCircle(int mx, int my) {
        double rad = c.getRadius();
        return distance(mx, my, x+rad, y+rad) < rad; 
        // What is the purpose of this check ? to check if the cursor is inside the circle using the length of the radius around the center point of the circle
    }

    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)); 
        // x1 is the x position of the mouse on the JPanel, Define other three positions (?).  x2 and y2 is the center of the circle, y1 is the y position of the mouse.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
