import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForTest extends Frame {

    JFrame frame;



    public MainForTest(){
        frame=new JFrame("ComboBox example");
        final JLabel label=new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        JButton button=new JButton("Show");
        button.setBounds(200,100,75,20);
        String [] language={"C","C++","C#","JAVA", "PHP"};
        final JComboBox comboBox=new JComboBox(language);
        comboBox.setBounds(50,100,75,20);
        frame.add(comboBox);
        frame.add(label);
        frame.add(button);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,350);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data="Selected programing Language:"+comboBox.getItemAt(comboBox.getSelectedIndex());
                label.setText(data);
            }
        });







    }

    public static void main(String[] args) {


        new MainForTest();
    }





    }



