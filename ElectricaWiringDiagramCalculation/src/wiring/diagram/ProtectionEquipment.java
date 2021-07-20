package wiring.diagram;

public class ProtectionEquipment extends ElectricalProduct {
    private double thermalCurrentMin;
    private double thermalCurrentMax;
    private int shortCircuitCurrent;
    public ProtectionEquipment(String orderNumber,double nominalVoltage, double nominalCurrent,
                               int noOfPhases, String frameSize,double thermalCurrentMin,
                               double thermalCurrentMax, int shortCircuitCurrent){
        super(orderNumber,nominalVoltage,nominalCurrent,noOfPhases,frameSize);
        this.thermalCurrentMin=thermalCurrentMin;
        this.thermalCurrentMax=thermalCurrentMax;
        this.shortCircuitCurrent=shortCircuitCurrent;
    }
    public double getThermalCurrentMin(){
        return thermalCurrentMin;
    }
    public double getThermalCurrentMax(){
        return thermalCurrentMax;
    }
    public int getShortCircuitCurrent(){
        return shortCircuitCurrent;
    }
    public void setThermalCurrentMin(double thermalCurrentMin){
        this.thermalCurrentMin=thermalCurrentMin;
    }

    public void setThermalCurrentMax(double thermalCurrentMax) {
        this.thermalCurrentMax = thermalCurrentMax;
    }

    public void setShortCircuitCurrent(int shortCircuitCurrent) {
        this.shortCircuitCurrent = shortCircuitCurrent;
    }
}
