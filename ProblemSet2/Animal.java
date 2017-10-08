package ProblemSet2;

import java.util.Arrays;

public class Animal{
    private String type;
    private String[] continents;
    private float weight;
    private int age;

    public Animal(){
        this("No Type Specified", null, 0.0f, 0);
    }

    public Animal(String type, String[] continents, float weight, int age){
        this.type = type;
        this.continents = continents;
        this.weight = weight;
        this.age = age;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String[] getContinents(){
        return continents;
    }
    public void setContinents(String[] continents){
        this.continents = continents;
    }

    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "Type: " + getType() + "\nContinents: " + Arrays.toString(getContinents()) +
                "\nWeight: " + getWeight() + "kg\nAge: " + getAge();
    }
}