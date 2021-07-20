public class CollectionManager {
//Power calculation method:
    public double motorPower(Motor motor){
        double motorPower=0.0;
        if(motor.getPhaseNumber()==3){
            motorPower=(1.73*motor.getVoltage()*motor.getCurrent()*motor.getPowerFactor()*motor.getEfficiency())/1000;
        }
        else if(motor.getPhaseNumber()==1){
            motorPower=(motor.getVoltage()*motor.getCurrent()*motor.getPowerFactor()*motor.getEfficiency())/1000;
        }
        else{
            System.out.println("The selected phase number is incorrect!\nPlease select 1 or 3 phase numbers!");
            //Calling the exit method
            //System.exit(1);
        }
        return motorPower;
    }

//Torque calculation:
    public double motorTorque(Motor motor){
        double motorTorque=(60/(2*3.14))*(motorPower(motor)*1000)/motor.getNominalSpeed();
        return motorTorque;
    }

}
