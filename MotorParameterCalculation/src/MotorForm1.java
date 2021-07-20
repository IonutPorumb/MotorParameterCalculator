import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import org.omg.CORBA.Any;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MotorForm1 extends JFrame implements ActionListener{

//Instance variables declaration:
    private JPanel motorPanel;
    private JTextField motorCurrent;
    private JComboBox motorVoltage;
    private JComboBox motorSynchronousSpeed;
    private JTextField motorPowerFactor;
    private JComboBox motorPhaseNumber;
    private JTextField motorEfficiency;
    private JButton calculateButton;
    private JTextField motorPower;
    private JTextField motorTorque;
    private JLabel motorCurrentLabel;
    private JLabel motorVoltageLabel;
    private JLabel motorSpeedLabel;
    private JLabel motorPowerFactorLabel;
    private JLabel motorPhaseNoLabel;
    private JLabel motorEfficiencyLabel;
    private JLabel motorPowerLabel;
    private JLabel motorTorqueLabel;

    private  double motorCurrentVal;
    private int motorVoltageVal;
    private int motorSpeedVal;
    private double motorPowerFactorVal;
    private int motorPhaseNoValInt;
    private double motorEfficiencyVal;
    private double calculatedMotorTorque;
    private double calculatedMotorPower;

    String motorCurrentText,motorVoltageText,motorSpeedText,motorPowerFactorText,motorEfficiencyText;



    public MotorForm1() {

        motorCurrent.setText("0");
        motorPowerFactor.setText("0");
        motorEfficiency.setText("0");

            calculateButton.addActionListener(this);
            calculateButton.addActionListener(e -> {
//Reading the value entered motor Current field
                motorCurrentText = motorCurrent.getText();
                motorCurrentVal = Double.parseDouble(motorCurrentText);
//System.out.println("Please introduce values for the motor parameters!");
//Reading the value entered in motor Voltage field
                motorVoltageText = String.valueOf(motorVoltage.getItemAt(motorVoltage.getSelectedIndex()));
                motorVoltageVal = Integer.parseInt(motorVoltageText);
//Reading the value entered in motor Speed field
                motorSpeedText = String.valueOf(motorSynchronousSpeed.getItemAt(motorSynchronousSpeed.getSelectedIndex()));
                motorSpeedVal = Integer.parseInt(motorSpeedText);
//Reading the value entered in motor Power factor field

                motorPowerFactorText = motorPowerFactor.getText();
                motorPowerFactorVal = Double.parseDouble(motorPowerFactorText);
//Reading the value entered in motor phase no field
                String motorPhaseNoVal = String.valueOf(motorPhaseNumber.getItemAt(motorPhaseNumber.getSelectedIndex()));
                motorPhaseNoValInt = Integer.parseInt(motorPhaseNoVal);
//Reading the value entered in motor efficiency field

                motorEfficiencyText = motorEfficiency.getText();
                motorEfficiencyVal = Double.parseDouble(motorEfficiencyText);

            });



//Calling the method that will aloud introduction of numbers only:
        motorCurrent.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyChar()<'0'||e.getKeyChar()>'9'){
                    motorCurrent.setEnabled(false);
                }
                else{
                    motorCurrent.setEnabled(true);
                }
            }
        });
    }
//Calling the method that will select what code is going to be executed when the calculateButton is pressed:
    @Override
    public void actionPerformed (ActionEvent e) {

//The code that is executed when we have a tri-phase system:
        if (motorPhaseNoValInt == 3 && e.getSource() == calculateButton) {
            calculatedMotorPower = 1.73 * motorVoltageVal * motorCurrentVal * motorPowerFactorVal * motorEfficiencyVal / 1000;
            calculatedMotorTorque = (60 / (2 * 3.14)) * calculatedMotorPower * 1000 / motorSpeedVal;
        }
//The code that is executed when we have a single-phase system:
        else if (motorPhaseNoValInt == 1 && e.getSource() == calculateButton) {
            calculatedMotorPower = motorVoltageVal * motorCurrentVal * motorPowerFactorVal * motorEfficiencyVal / 1000;
            calculatedMotorTorque = (60 / (2 * 3.14)) * calculatedMotorPower * 1000 / motorSpeedVal;
        }
//Setting the precision with two digits to motorPower field and to motorTorque field:

        motorPower.setText(String.valueOf(String.format("%.2f", calculatedMotorPower)));
        motorTorque.setText(String.valueOf(String.format("%.2f", calculatedMotorTorque)));

    }

//Calling the main method to start the execution of the program:
            public static void main(String[] args){

            JFrame frame = new JFrame("Motor Form");
            frame.setLocation(600, 10);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new MotorForm1().motorPanel);
            frame.pack();
            frame.setVisible(true);



        }
}



