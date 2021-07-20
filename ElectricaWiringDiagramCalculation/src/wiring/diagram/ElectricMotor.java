package wiring.diagram;
import javax.swing.JFrame;

public class ElectricMotor extends ElectricalProduct {
    private double nominalPower;
    private double powerFactor=0.84;
    private double efficiency=0.91;
    public ElectricMotor(String orderNumber,double nominalVoltage, double nominalCurrent,
                         int noOfPhases, String frameSize,double nominalPower, double powerFactor, double efficiency){
        super(orderNumber,nominalVoltage,nominalCurrent,noOfPhases,frameSize);
        this.nominalPower=nominalPower;
        this.powerFactor=powerFactor;
        this.efficiency=efficiency;
    }
    public ElectricMotor(String orderNumber,double nominalVoltage, double nominalCurrent,
                         int noOfPhases, String frameSize,double nominalPower){
        super(orderNumber,nominalVoltage,nominalCurrent,noOfPhases,frameSize);
        this.nominalPower=nominalPower;
    };
    public double getNominalPower(){
        return nominalPower;
    }
    public double getPowerFactor(){
        return powerFactor;
    }
    public double getEfficiency(){
        return efficiency;
    }
    public void setNominalPower(double nominalPower){
        this.nominalPower=nominalPower;
    }
    public void setPowerFactor(double powerFactor){
        this.powerFactor=powerFactor;
    }
    public void setEfficiency(double efficiency){
        this.efficiency=efficiency;
    }

    @Override
    public String toString(){
        return( "Order Number: "+getOrderNumber()+"\n"+
                "Nominal voltage: "+getNominalVoltage()+" V\n"+
                "Nominal current: "+getNominalCurrent()+" A\n"+
                getNoOfPhases()+" Phases\n"+
                "Frame size: "+getFrameSize()+
                "Nominal power: "+getNominalPower()+"\n"+
                "Power factor: "+getPowerFactor()+"\n"+
                "Efficiency: "+getEfficiency());
    }






}
