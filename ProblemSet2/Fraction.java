package ProblemSet2;

public class Fraction{
    private int numerator, denominator;

    public Fraction(){
        this.numerator = 10;
        this.denominator = 20;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction f){
        Fraction result = new Fraction();
        result.setNumerator((getNumerator() * f.getDenominator()) + (getDenominator() * f.getNumerator()));
        result.setDenominator(f.getDenominator() * getDenominator());
        return result;
    }

    public Fraction subtract(Fraction f){
        Fraction result = new Fraction();
        result.setNumerator((getNumerator() * f.getDenominator()) - (f.getNumerator() * getDenominator()));
        result.setDenominator(f.getDenominator() * getDenominator());
        return result;
    }

    public Fraction multiply(Fraction f){
        Fraction result = new Fraction();
        result.setNumerator((f.getNumerator() * getNumerator()));
        result.setDenominator(f.getDenominator() * getDenominator());
        return result;
    }

    public Fraction divide(Fraction f){
        Fraction result = new Fraction();
        result.setNumerator((getNumerator() * f.getDenominator()));
        result.setDenominator(getDenominator() * f.getNumerator());
        return result;
    }

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString(){
        return getNumerator() + "/" + getDenominator();
    }
}