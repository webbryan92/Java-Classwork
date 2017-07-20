//import GUI components
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//
public class Pendulum extends JPanel {
    //declare needed variables

    Timer timer = new Timer(100, new Start());  //create a timer object  
    double angle = 90; //defualt angle    
    double anglechange = 1; //change in angle    
    double angleL = 140; //left maximum    
    double angleR = 40; //right maximum
    int length; //length of pendulum
    JLabel start; //start
    JButton resume; //resume
    boolean go = false; //set go to false by default until an action sets it true
    int X;
    int Y;

    public Pendulum() {
        super();
        length = 150; //set a length for the pendulum in the constructor
        //setDoubleBuffered(true); // create a buffer
        //tell user to press the screen to start the pendulum
        start = new JLabel("Press to start"); 
        //add start to the frame.
        this.add(start);
        //set the label to be visible
        start.setVisible(true);
        //add a resume button
        resume = new JButton("Resume");
        /*add listener Start to the resume button to start the timer when
         * resume is clicked
         */
        resume.addActionListener(new Start());
        //add resume to the frame
        this.add(resume);
        //start.setForeground(Color.white);
        //set the button to visible
        start.setVisible(true);
        //set the frame to be able to be focused
        this.setFocusable(true);
        //allow the program to request focus
        //this.setRequestFocusEnabled(true);
        //request the component gets the input focus
        //this.grabFocus();        
        //listenes for the up and down keys and adjusts timer delay accordingly
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 38) {
                    //restrict the program from dropping the delay to zero
                    if (timer.getDelay() > 10) {
                        //reduce delay by 5 every time the up arrow is pressed
                        timer.setDelay(timer.getDelay() - 10);
                    }
                } else if (e.getKeyCode() == 40) {
                    //increase delay by 5 every time the down arrow is pressed
                    timer.setDelay(timer.getDelay() + 10);
                }
            }
        });
        /*add a new mouse listener to check if the mouse clicks inside the
        pendulum */
        this.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) {
                /*if statement checking if the mouses position is inside the
                pendulum */
                if (insideCircle(e.getX(), e.getY())) {
                    go = false;
                    start.setVisible(true);
                    timer.stop(); //stop timer if inside
                    repaint();
                }
            }
        });
        
    }
    /*take mouse position and check to see if it is less than 20 distance
    from the center of the pendulum*/
    public boolean insideCircle(int mousex, int mousey) {
            return distance(mousex, mousey, X, Y) < 40;
        }
    //returns the distance between two points.
    public double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1));
    }

    class Start implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            /*when resume is clicked set the start label to false and set
             * go to true and start the timer.
             */
            if (e.getSource() == resume) {
                go = true;
                start.setVisible(false);
                timer.start();
            }
            /*if timer calls the method through the delay then just repaint
             * at new location
             */
            if (e.getSource() == timer) {
                repaint();
            }
        }
    }
    public void paintComponent(Graphics g) { 
        super.paintComponent(g);
        //find location of anchor
        int anchorX = getWidth() / 2;
        int anchorY = 40;
        /*set where the X, Y of the endpoint of the line and the reference for
        the center of the pendulum circle*/
        X = anchorX + (int) (Math.cos(Math.toRadians(angle)) * length);
        Y = anchorY + (int) (Math.sin(Math.toRadians(angle)) * length);
        //change the angle when it reaches the peak of its swing
        if (go) {
            if (angle < angleR) {
                anglechange++;
            } else if (angle > angleL) {
                anglechange--;
            }
            angle += anglechange;
            //set defualt position to 90
        } else {
            angle = 90;
            repaint();
        } 
        //draw the line
        g.drawLine(anchorX, anchorY, X, Y);
        /*draw the oval for the pendulum at position x and y -20 with a 
         diameter of 40*/
        g.drawOval(X - 20, Y - 20, 40, 40);
        this.grabFocus();
    }
    public static void main(String[] args) {
        Pendulum pendulum = new Pendulum();
        //create a new Jframe with a title
        JFrame frame = new JFrame("Personal Assignment 3 Pendulum");
        frame.add(pendulum);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(400, 400); 
    }
}
