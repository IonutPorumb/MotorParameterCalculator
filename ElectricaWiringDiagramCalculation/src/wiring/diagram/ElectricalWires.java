package wiring.diagram;

public class ElectricalWires {
    private double section;
    private String insulationType;
    private int noOfWires;
    private double ampacity;

    public ElectricalWires(double section, String insulationType,int noOfWires, double ampacity){
        this.section=section;
        this.insulationType=insulationType;
        this.noOfWires=noOfWires;
        this.ampacity=ampacity;
    }
    public double getSection(){
        return section;
    }
    public String getInsulationType(){
        return insulationType;
    }
    public int getNoOfWires(){
        return noOfWires;
    }
    public double getAmpacity() {
        return ampacity;
    }

    public void setSection(double section) {
        this.section = section;
    }

    public void setInsulationType(String insulationType) {
        this.insulationType = insulationType;
    }

    public void setNoOfWires(int noOfWires) {
        this.noOfWires = noOfWires;
    }

    public void setAmpacity(double ampacity) {
        this.ampacity = ampacity;
    }

    @Override
    public String toString(){
        return(getSection()+" mm\u00B2");
    }




}
