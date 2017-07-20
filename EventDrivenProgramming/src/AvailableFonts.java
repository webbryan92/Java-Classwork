import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AvailableFonts extends JFrame {


    public AvailableFonts(String s){

        Font f  = new Font("Utopia", Font.BOLD+Font.ITALIC, 14);
        JPanel jp = new JPanel(new BorderLayout());
        JTextArea jta = new JTextArea(s);
        jta.setFont(f);
        jta.setBackground(Color.GRAY);
        jta.setForeground(new Color(0, 0, 0));
        JScrollPane jsp = new JScrollPane(jta);
        jsp.getVerticalScrollBar().addAdjustmentListener(new MyAdjustmentListener());
        jp.add(jsp);
        add(jp);
        setTitle("All Available Fonts");
        setSize(400, 200);
        setVisible(true);
    }

    public static String findallFontNames(){
        GraphicsEnvironment e =   GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontnames =   e.getAvailableFontFamilyNames();
        String s = new String();
        for (int i = 0; i < fontnames.length; i++)
            if (fontnames[i]!= null)
                s += fontnames[i] + "\n";
        return s;
    }

     class MyAdjustmentListener implements AdjustmentListener {
        public void adjustmentValueChanged(AdjustmentEvent e) {            
            repaint();
        }
    }

    public static void main(String[] args) {

        String s = AvailableFonts.findallFontNames();
        AvailableFonts avfnt = new AvailableFonts(s);
        avfnt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}



