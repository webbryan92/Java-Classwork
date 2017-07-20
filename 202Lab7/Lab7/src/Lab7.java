/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab7 extends JFrame{       
    public Lab7(){
        add(new Panel());        
    }
    public static void main(String[] args) {
        //create a new Jframe with a title
        JFrame frame = new Lab7();
        frame.setTitle("I must go my people need me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000, 100); 
    }
    
    class Panel extends JPanel implements ActionListener {
        Timer timer;
        int x;
        int y;
        int delay = 1;
        int rad = 25;
        public Panel(){
            timer = new Timer(10, this);
            timer.start();
            this.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) {
                if (insideCircle(e.getX(), e.getY())) {
                    timer.stop(); 
                    repaint();
                }
            }
            public boolean insideCircle(int mousex, int mousey) {
            return distance(mousex, mousey, x+rad, y+rad) < rad;
            }
            //returns the distance between two points.
            public double distance(double x1, double y1, double x2, double y2) {
                return Math.sqrt((x2 - x1)*(x2 - x1)+(y2 - y1)*(y2 - y1));
            }
        });
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == timer) {
                repaint();
            }
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(x,y, rad*2, rad*2);
            if(x < 933){
                x += delay;
            }
        }        
    }   
}
