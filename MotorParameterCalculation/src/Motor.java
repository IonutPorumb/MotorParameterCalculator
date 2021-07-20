public class Motor {
    private int voltage;
    private double current;
    private double powerFactor;
    private int phaseNumber;
    private double efficiency;
    private int nominalSpeed;

//Class constructor:
    public Motor (int voltage,
                  double current,
                  double powerFactor,
                  int phaseNumber,
                  double efficiency,
                  int nominalSpeed){
        this.voltage=voltage;
        this.current=current;
        this.powerFactor=powerFactor;
        this.phaseNumber=phaseNumber;
        this.efficiency=efficiency;
        this.nominalSpeed=nominalSpeed;
    }

    //Getter methods:
    public int getVoltage(){
        return voltage;
    }
    public double getCurrent(){
        return current;
    }
    public double getPowerFactor(){
        return powerFactor;
    }
    public int getPhaseNumber(){
        return phaseNumber;
    }
    public double getEfficiency(){
        return efficiency;
    }
    public int getNominalSpeed(){
        return  nominalSpeed;
    }
//Setter methods:
    public void setVoltage(int voltage){
        this.voltage=voltage;
    }
    public void setCurrent(double current){
        this.current=current;
    }
    public void setPowerFactor(double powerFactor){
        this.powerFactor=powerFactor;
    }
    public void setPhaseNumber(int phaseNumber){
        this.phaseNumber=phaseNumber;
    }
    public void setEfficiency(double efficiency){
        this.efficiency=efficiency;
    }
    public void setNominalSpeed(int nominalSpeed){
        this.nominalSpeed=nominalSpeed;
    }


//Overriding toString method:
    @Override
    public String toString(){
        return ("Motor :"+
                "\n Phase number :"+getPhaseNumber()+
                "\n Voltage :"+getVoltage()+" V"+
                "\n Current :"+getCurrent()+" A"+
                "\n Power factor :"+getPowerFactor()+
                "\n Active power :");
    }




}
