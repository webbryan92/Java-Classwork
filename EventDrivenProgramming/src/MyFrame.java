import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class MyFrame {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Test Frame");//create a new frame
       
        //frame.getContentPane().add(new JButton("YES"));
        Color c = new Color(255, 255, 255); //r, b, g: 0-255:0 black, 255 white. create new color
        Font f  = new Font("SansSErif", Font.BOLD+Font.ITALIC, 14); //create a new font
        JButton OKBT= new JButton("OK"); //create a new button
        OKBT.setFont(f); //font of the button
        OKBT.setForeground(c); //foreground color of the button
        OKBT.setBackground(new Color(0, 0, 0)); // background color of the button
        frame.add(OKBT); // add the button to frame
        frame.setSize(400, 300); //width, height
        frame.setLocationRelativeTo(null); // center of the screen
        frame.setVisible(true); //show the frame on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


