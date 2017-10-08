package ProblemSet0;

import javax.swing.*;
/**
 * Created by t00196631 on 13/09/2017.
 */
public class Exercise3{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name");
        String taxableIncome = JOptionPane.showInputDialog("Enter taxable income");
        int incomeConv = Integer.parseInt(taxableIncome);

        float taxRate;
        if(incomeConv < 20000){
            taxRate = 0;
        }else if(incomeConv > 36000){
            taxRate = .41f;
        }else{
            taxRate = .20f;
        }

        float calcTax = incomeConv * taxRate;

        JOptionPane.showMessageDialog(null, incomeConv + "\n" + calcTax + "\n"
                + (incomeConv - calcTax));

    }
}