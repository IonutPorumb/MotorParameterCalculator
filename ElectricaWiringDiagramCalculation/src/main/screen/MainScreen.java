package main.screen;

import javax.swing.*;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class MainScreen {
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JButton circuitTypeButton;
    private JTextField circuitName;
//creating the class constructor:
    public MainScreen(){
        gui();
    }
    public void gui(){

//Creation of the main frame:
        mainFrame=new JFrame("Main Screen");

        mainFrame.setSize(500,600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Creation of the main panel:
        mainPanel=new JPanel();
        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setBorder(BorderFactory.createBevelBorder(10,Color.BLACK,Color.CYAN));
        mainPanel.setBounds(5,5,400,600);

        mainFrame.setLayout(null);
//Creating the control voltage circuit button:
        circuitTypeButton=new JButton("Control Voltage");
        circuitTypeButton.setBounds(10,10,100,40);

        mainFrame.add(mainPanel);
        mainPanel.add(circuitTypeButton);
        circuitName=new JTextField(10);
        circuitName.setBounds(10,50,200,40);

        mainPanel.add(circuitName);

        circuitTypeButton.setVisible(true);

        circuitName.setVisible(true);

        mainFrame.setVisible(true);

        Graphics g=mainPanel.getGraphics();
        g.drawLine(5,5,50,50);


        }





    public static void main(String[] args) {

        GuiClass gC=new GuiClass();


    }





}
