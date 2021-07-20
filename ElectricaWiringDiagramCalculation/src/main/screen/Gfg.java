package main.screen;

import javax.swing.*;

public class Gfg {
    public static void main(String[] args) {
        JFrame window=new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(0,0,500,400);
        window.getContentPane().add(new drawLines());

        window.setVisible(true);

    }


}
