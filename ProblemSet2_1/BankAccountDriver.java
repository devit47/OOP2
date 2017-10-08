package ProblemSet2_1;

import javax.swing.*;

public class BankAccountDriver{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12544", 455.45, new Person("Ger"));
        acc1.lodge(45.00);
        acc1.withdraw(100.00);
        System.out.println(acc1.toString());


        String userInput = JOptionPane.showInputDialog("How many accounts to be made?");
        int inputAsInt = Integer.parseInt(userInput);

        BankAccount[] multAccs = new BankAccount[inputAsInt];

        for(int i = 0; i < inputAsInt; i++){
            multAccs[i] = new BankAccount();
            multAccs[i].setAccNum("Bank Account" + (i + 1));
            multAccs[i].setBalance(45);
            System.out.println(multAccs[i].toString());
        }
    }
}
