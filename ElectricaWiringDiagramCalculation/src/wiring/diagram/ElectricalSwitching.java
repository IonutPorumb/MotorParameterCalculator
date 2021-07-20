package wiring.diagram;

public class ElectricalSwitching extends ElectricalProduct{
    private int controlVoltage;
    public ElectricalSwitching(String orderNumber,double nominalVoltage, double nominalCurrent,
                           int noOfPhases, String frameSize, int controlVoltage){
        super(orderNumber,nominalVoltage,nominalCurrent,noOfPhases, frameSize);
        this.controlVoltage=controlVoltage;
    }
    public int getControlVoltage(){
        return controlVoltage;
    }
    public void setControlVoltage(int controlVoltage){
        this.controlVoltage=controlVoltage;
    }




}
