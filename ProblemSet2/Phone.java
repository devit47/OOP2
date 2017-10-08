package ProblemSet2;

public class Phone{
    private String phNumber, make, model;
    private boolean isOn;

    public Phone(){
        this.phNumber = "0800000000";
        this.make = "Unknown";
        this.model = "Unknown";
        this.isOn = false;
    }

    public Phone(String phNumber, String make, String model, boolean isOn){

    }

    public String getPhNumber() {
        return phNumber;
    }
    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public boolean isOn() {
        return isOn;
    }
    public void setOn(boolean on) {
        isOn = on;
    }

    public String toString(){
        return getPhNumber() + "\n" + getMake() + "\n" + getModel();
    }
}
