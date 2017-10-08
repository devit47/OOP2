package ProblemSet2_1;

public class BankAccount{
    private String accNum;
    private double balance;
    private Person accHolder = new Person();

    public BankAccount(){
        this("0000", 0.0, null);
    }

    public BankAccount(String accNum, double balance, Person accHolder){
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public void lodge(double amount){
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount){
        setBalance((getBalance() - amount));
    }

    public String getAccNum() {
        return accNum;
    }
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Account Number: " + getAccNum() + "\nBalance: " + getBalance()
                + "\nAccount Holder: " + accHolder;
    }
}