package ProblemSet2;

public class FractionDriver{
    public static void main(String[] args){
        Fraction frac = new Fraction();
        System.out.println("testing the no-args constructor..." + frac.toString());

        Fraction frac1 = new Fraction(15, 25);
        System.out.println("testing the 2-args constructor..." + frac1.toString());

        Fraction frac2 = new Fraction(10, 20);

        System.out.println("Value of " + frac1.toString() + " + " + frac2.toString() + " is " + frac1.add(frac2).toString());
        System.out.println("Value " + frac1.subtract(frac2).toString());
        System.out.println("Value " + frac1.multiply(frac2).toString());
        System.out.println("Value " + frac1.divide(frac2).toString());
    }
}