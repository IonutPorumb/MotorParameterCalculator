package main.screen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.jar.JarEntry;

public class PlayWithButtons extends JPanel implements ActionListener{
        private JButton b1, b2, b3;

    public PlayWithButtons() {

        b1=new JButton("Disable middle button");
        b1.setVerticalTextPosition(AbstractButton.BOTTOM);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_D);
        b1.setActionCommand("disable");


        b2=new JButton("Middle button");
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_M);


        b3=new JButton("Enable middle button");
        //Use the default text position of CENTER, TRAILING(RIGHT).
        b3.setMnemonic(KeyEvent.VK_E);
        b3.setActionCommand("enable");
        b3.setEnabled(false);

        //Listen of actions for buttons 1 and 3.
        b1.addActionListener(this);
        b3.addActionListener( this);

        b1.setToolTipText("Click this button to disable"+"the middle button.");
        b2.setToolTipText("This button does nothing"+"when you click it");
        b3.setToolTipText("Click this button to enable"+"the middle button");

//Add components to this container, using the default FlowLayout.
        add(b1);
        add(b2);
        add(b3);
    }

    public void actionPerformed(ActionEvent e){
        if("disable".equals(e.getActionCommand())){
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        }
        else{
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
    }
    /**Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path){
        java.net.URL imgURL=PlayWithButtons.class.getResource(path);
        if(imgURL!=null){
            return new ImageIcon(imgURL);
        }
        else{
            System.err.println("Couldn't find file: "+path);
            return null;
        }

    }

    /**
     * Create the GUI and show it. For thread safety,
     * this method should be invoked from event dispatching threat.
     */
    public static void createAndShowGUI(){
        //Create and setup the window:
        JFrame frame=new JFrame("Button Demo");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        //Create and setup the content pane.
        PlayWithButtons newContentPane=new PlayWithButtons();
        newContentPane.setOpaque(true);//content pane must be opaque
        frame.setContentPane(newContentPane);
        //Display the window;
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //Creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }


}
