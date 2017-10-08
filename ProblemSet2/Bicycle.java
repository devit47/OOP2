package ProblemSet2;

public class Bicycle{
    private String ownersName, make;
    private float value;

    public Bicycle(){
    }

    public Bicycle(String ownersName, float value, String make){
        this.ownersName = ownersName;
        this.value = value;
        this.make = make;
    }

    public String getOwnersName() {
        return ownersName;
    }
    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }

    public String toString(){
        return getOwnersName() + "\n" + getValue() + "\n" + getMake();
    }
}