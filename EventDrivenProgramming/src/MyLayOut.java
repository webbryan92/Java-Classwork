
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyLayOut extends JFrame {
    
    public MyLayOut(){
        //horizontal gap 5 and vertical gap 10
        JPanel jp = new JPanel(new BorderLayout(5,10));

        // aligned center, hrizontl gap 10 and vertical gap 20
        //JPanel jp = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));

        //2rows, 1 col, horzntl and vertical gap = 10
        //JPanel jp = new JPanel(new GridLayout(2,1,10,10)); //1row, 1cols, horzntl and vertical gap = 5

        Color c = new Color(190, 55, 155); //r, b, g: 0-255:0 black, 255 white.
        Font f  = new Font("Utopia", Font.BOLD+Font.ITALIC, 14);
        JButton YBT= new JButton("YES");
        JButton NBT= new JButton("NO");
        YBT.setFont(f);
        YBT.setForeground(c);
        YBT.setBackground(new Color(0, 0, 0));
        jp.add(YBT, BorderLayout.EAST);
        NBT.setFont(f);
        NBT.setForeground(c);
        NBT.setBackground(new Color(0, 0, 0));
        jp.add(NBT, BorderLayout.WEST);
        add(jp);
        setTitle("Playing with the Layout Managers");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    

    public static void main(String[] args) {   
        MyLayOut mblo = new MyLayOut();
        mblo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}



