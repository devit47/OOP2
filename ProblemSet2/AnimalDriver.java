package ProblemSet2;

public class AnimalDriver{
    public static void main(String[] args) {

        Animal monkey = new Animal();
        monkey.setType("Monkey");
        monkey.setContinents(null);
        monkey.setWeight(45.7f);
        monkey.setAge(21);

        System.out.println(monkey.toString());

        Animal turtle = new Animal("Turtle", new String[] {"Europe", "Asia"}, 107.6f, 97);
        System.out.println(turtle.toString());
    }
}