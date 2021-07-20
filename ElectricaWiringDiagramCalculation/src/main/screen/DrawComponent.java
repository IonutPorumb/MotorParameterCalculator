package main.screen;

import javax.swing.*;
import java.awt.*;

public class DrawComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D gr=(Graphics2D) g;
        Rectangle rectangle=new Rectangle(100,100,200,50);
        gr.draw(rectangle);
    }

}
