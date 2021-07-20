package main.screen;

import javax.swing.*;
import java.awt.*;


public class drawLines extends JComponent {
    public void paint(Graphics g){
        super.paintComponent(g);
        Graphics2D g2D=(Graphics2D)g;
        g2D.setStroke(new BasicStroke(8));
        g2D.drawLine(100,200,1200,200);
        g2D.drawLine(580,500,620,580);
        g2D.drawLine(620,500,620,200);
        g2D.drawLine(620,580,620,800);
        g2D.drawOval(570,800,100,100);




        g.setColor(Color.red);

    }

}
