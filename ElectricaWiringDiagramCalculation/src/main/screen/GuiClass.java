package main.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class GuiClass extends Component {
    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;
    private JTextField text1;
    private Graphics line;

    public GuiClass() {
        gui();
    }

    public void gui() {
        f = new JFrame("Main Frame");
        f.setSize(1000, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        p = new JPanel();
        p.setBounds(2, 400, 1000, 800);
        p.setBackground(Color.WHITE);



        f.add(p);



        f.setVisible(true);

    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawLine(4, 4, 300, 4);

    }

    public static void main(String[] args) {
        GuiClass gr = new GuiClass();
        




    }
}