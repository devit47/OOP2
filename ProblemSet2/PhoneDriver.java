package ProblemSet2;

public class PhoneDriver{
    public static void main(String[] args) {
        Phone fone1 = new Phone();

        System.out.println(fone1.toString());

        Phone argsPhone = new Phone("0871234567", "Nokia", "3310", true);
    }
}
