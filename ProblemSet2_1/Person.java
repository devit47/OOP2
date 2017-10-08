package ProblemSet2_1;

public class Person{
    private String name;

    public Person(){
        this("Bob");
    }

    public Person(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return getName();
    }
}