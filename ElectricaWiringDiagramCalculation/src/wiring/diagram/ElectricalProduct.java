package wiring.diagram;

public class ElectricalProduct {
// instance variables

    private double nominalVoltage;
    private double nominalCurrent;
    private int noOfPhases;
    private String frameSize;
    private String orderNumber;

//The class constructor:

    public ElectricalProduct(String orderNumber,double nominalVoltage, double nominalCurrent,
                             int noOfPhases, String frameSize){
        this.orderNumber=orderNumber;
        this.nominalVoltage=nominalVoltage;
        this.nominalCurrent=nominalCurrent;
        this.noOfPhases=noOfPhases;
        this.frameSize=frameSize;
    }



//The getter and setter methods:

    public double getNominalVoltage(){
        return nominalVoltage;
    }
    public double getNominalCurrent(){
        return nominalCurrent;
    }
    public int getNoOfPhases(){
        return noOfPhases;
    }
    public String getFrameSize(){
        return frameSize;
    }
    public String getOrderNumber(){
        return orderNumber;
    }

    public void setNominalVoltage(double nominalVoltage){
        this.nominalVoltage=nominalVoltage;
    }
    public void setNominalCurrent(double nominalCurrent) {
        this.nominalCurrent = nominalCurrent;
    }
    public void setNoOfPhases(int noOfPhases){
        this.noOfPhases=noOfPhases;
    }
    public void setFrameSize(String frameSize){
        this.frameSize=frameSize;
    }
    public void setOrderNumber(String orderNumber){
        this.orderNumber=orderNumber;
    }
//Compare two products
    @Override
    public boolean equals(Object o){
        ElectricalProduct eP=(ElectricalProduct) o;
        return eP.getOrderNumber().equals(((ElectricalProduct) o).getOrderNumber());
    }
    @Override
    public int hashCode(){
        return orderNumber.hashCode();

    }
    @Override
    public String toString(){
        return("Order Number: "+getOrderNumber()+"\n"+
               "Nominal voltage: "+getNominalVoltage()+" V\n"+
               "Nominal current: "+getNominalCurrent()+" A\n"+
               getNoOfPhases()+" Phases\n"+
               "Frame size: "+getFrameSize());
    }




}
