package main.screen;

import javax.swing.*;

public class DropDownButton {

    public static void main(String[] args) {


//we create a new frame:
        //The visibility of the frame will have to be written at the end of the instructions!:
        JFrame frame1 = new JFrame("Main window");
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        frame1.setSize(1980,1080);
        frame1.setLocation(10,10);
//We create a panel inside the new created frame:
        JPanel panel1=new JPanel();
        frame1.add(panel1);
//We create the drop-down selection button:
        JLabel label1=new JLabel("Select the circuit type and click OK button");
        label1.setVisible(true);
        panel1.add(label1);
//We define the multiple choices available in the drop-down list:
        String[]availableChoices={"None","Direct Online","Wey-Delta Starter","Soft Starter","Variable Speed Drive"};
        final JComboBox<String> comboBox=new JComboBox<String>(availableChoices);
        comboBox.setVisible(true);
        panel1.add(comboBox);
        JButton button1=new JButton("OK");
        panel1.add(button1);
        button1.setLocation(20,20);
//We put the condition to show the selected wiring diagram according to selected drop-down list:
        frame1.getContentPane().add(new drawLines());

        if(comboBox.equals("Direct Online")){

        }

        frame1.setVisible(true);








    }
}
