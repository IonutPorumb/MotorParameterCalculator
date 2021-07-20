import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MotorField extends Frame implements ActionListener {

    //Variable declaration:
    private double motorCurrentVal;
    private int motorVoltageVal;
    private int motorSpeedVal;
    private double motorPowerFactorVal;
    private int motorPhaseNoValInt;
    private double motorEfficiencyVal ;
    private double calculatedMotorPower;
    private double calculatedMotorTorque;

    JTextField motorCurrent, motorPowerFactor,
               motorEfficiency, motorPower,
               motorTorque;
    JLabel motorCurrentL, motorVoltageL,
           motorSpeedL, motorPowerFactorL,
           motorPhaseNoL, motorEfficiencyL,
           motorPowerL, motorTorqueL;
    JButton calculate;
    JComboBox motorPhaseNo, motorVoltage,
              motorSpeed;

    public MotorField() {


//Create a JFrame object
        JFrame f = new JFrame("Motor parameter calculation");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(500, 800);

//Create a field for motor current:
        motorCurrent = new JTextField();
        motorCurrent.setBounds(100, 50, 100, 25);
        motorCurrent.setToolTipText("Insert the motor nominal current value in A");
        f.add(motorCurrent);
        motorCurrentL = new JLabel("Motor Current [A]");
        motorCurrentL.setVisible(true);
        motorCurrentL.setBounds(100, 30, 100, 25);
        f.add(motorCurrentL);

//Create a field for motor voltage:
        String [] motorVoltageList={"220","230","240","380","400","415","440","460","480","500","575","660","690"};
        motorVoltage = new JComboBox(motorVoltageList);
        motorVoltage.setBounds(100, 100, 100, 25);
        motorVoltage.setToolTipText("Insert the motor nominal voltage value in V");
        f.add(motorVoltage);
        motorVoltageL = new JLabel("Motor Voltage [V]");
        motorVoltageL.setVisible(true);
        motorVoltageL.setBounds(100, 80, 100, 25);
        f.add(motorVoltageL);

//Create a field for motor speed:
        String[] motorSpeedList={"375","500","600","750","1000","1500","3000",};
        motorSpeed = new JComboBox(motorSpeedList);
        motorSpeed.setBounds(100, 150, 100, 25);
        motorSpeed.setToolTipText("Insert the motor synchronous speed value in rmp");
        f.add(motorSpeed);
        motorSpeedL = new JLabel("Motor synchronous speed [Rpm]");
        motorSpeedL.setVisible(true);
        motorSpeedL.setBounds(100, 130, 190, 25);
        f.add(motorSpeedL);

//Create a field for motor powerFactor:
        motorPowerFactor = new JTextField();
        motorPowerFactor.setBounds(100, 200, 100, 25);
        motorPowerFactor.setToolTipText("Insert the motor power factor value");
        f.add(motorPowerFactor);
        motorPowerFactorL = new JLabel("Motor power factor");
        motorPowerFactorL.setVisible(true);
        motorPowerFactorL.setBounds(100, 180, 120, 25);
        f.add(motorPowerFactorL);

//Create a field for motor phase no:

        String[] phaseNoList = {"1", "3"};
        motorPhaseNo = new JComboBox(phaseNoList);
        motorPhaseNo.setBounds(100, 250, 100, 25);
        motorPhaseNo.setToolTipText("Insert the motor's supply phase no.");
        f.add(motorPhaseNo);
        f.setLayout(null);

        motorPhaseNoL = new JLabel("Power supply phase no.");
        motorPhaseNoL.setBounds(100, 230, 150, 25);
        f.add(motorPhaseNoL);

//Create a field for motor efficiency:
        motorEfficiency = new JTextField();
        motorEfficiency.setBounds(100, 300, 100, 25);
        motorEfficiency.setToolTipText("Insert the motor's efficiency value");
        f.add(motorEfficiency);
        motorEfficiencyL = new JLabel("Motor's efficiency");
        motorEfficiencyL.setBounds(100, 280, 120, 25);
        f.add(motorEfficiencyL);

//Create a calculation button:
        calculate = new JButton("Calculate");
        calculate.setBounds(100, 400, 100, 25);
        calculate.setToolTipText("Press the button to calculate the motor's values");
        calculate.addActionListener(this);
        f.add(calculate);

//Create a field for motor power calculation result:
        motorPower = new JTextField();
        motorPower.setBounds(100, 450, 100, 25);
        motorPower.setToolTipText("The result value will be displayed after pressing the Calculate button");
        f.add(motorPower);
        motorPowerL = new JLabel("Calculated motor Power [kW]");
        motorPowerL.setBounds(100, 430, 170, 25);
        motorPowerL.setVisible(true);
        f.add(motorPowerL);


//Create a field for motor torque calculation result:
        motorTorque = new JTextField();
        motorTorque.setBounds(100, 500, 100, 25);
        motorTorque.setToolTipText("The result value will be displayed after pressing the Calculate button");
        f.add(motorTorque);
        motorTorqueL = new JLabel("Calculated motor Torque [Nm]");
        motorTorqueL.setBounds(100, 480, 170, 25);
        motorTorqueL.setVisible(true);
        f.add(motorTorqueL);
        f.setVisible(true);
        calculate.addActionListener(e -> {
            String motorCurrentText = motorCurrent.getText();
            motorCurrentVal = Double.parseDouble(motorCurrentText);
            String motorVoltageText = String.valueOf(motorVoltage.getItemAt(motorVoltage.getSelectedIndex()));
            motorVoltageVal = Integer.parseInt(motorVoltageText);
            System.out.println("-----------------"+motorVoltageVal);
            String motorSpeedText = String.valueOf(motorSpeed.getItemAt(motorSpeed.getSelectedIndex()));
            motorSpeedVal = Integer.parseInt(motorSpeedText);
            String motorPowerFactorText = motorPowerFactor.getText();
            motorPowerFactorVal = Double.parseDouble(motorPowerFactorText);
            String motorPhaseNoVal = String.valueOf(motorPhaseNo.getItemAt(motorPhaseNo.getSelectedIndex()));
            motorPhaseNoValInt = Integer.parseInt(motorPhaseNoVal);

            System.out.println("++++++++++++++++++" + motorPhaseNoVal);

            String motorEfficiencyText = motorEfficiency.getText();
            motorEfficiencyVal = Double.parseDouble(motorEfficiencyText);
        });
        //Setting and reading the information for text fields:
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (motorPhaseNoValInt == 3 && e.getSource() == calculate) {
            calculatedMotorPower = 1.73 * motorVoltageVal * motorCurrentVal * motorPowerFactorVal * motorEfficiencyVal / 1000;
            calculatedMotorTorque = (60 / (2 * 3.14)) * calculatedMotorPower * 1000 / motorSpeedVal;
        }
        else if (motorPhaseNoValInt == 1 && e.getSource() == calculate) {
            calculatedMotorPower = motorVoltageVal * motorCurrentVal * motorPowerFactorVal * motorEfficiencyVal / 1000;
            calculatedMotorTorque = (60 / (2 * 3.14)) * calculatedMotorPower * 1000 / motorSpeedVal;
        }

        //String calculatedMotorP= String.format(String.valueOf(calculatedMotorPower),"%.2f");

        motorPower.setText(String.valueOf(String.format("%.2f", calculatedMotorPower)));
        motorTorque.setText(String.valueOf(String.format("%.2f", calculatedMotorTorque)));

    }

    public static void main(String[] args) {

        new MotorField();

    }



}




















