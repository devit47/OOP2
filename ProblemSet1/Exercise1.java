package ProblemSet1;

import javax.swing.*;
/**
 * Created by Dave Griffin on 19/09/2017.
 */
public class Exercise1{
    public static void main(String[] args) {
        String poundRate = JOptionPane.showInputDialog("Please enter the GB£ exchange rate of 1 €");
        float rateAsFloat = Float.parseFloat(poundRate);

        boolean runConversion = true;
        while(runConversion == true){
            String userEntry = JOptionPane.showInputDialog(null, "Enter the number of GB£ you wish to convert to euros\nq to quit");
            if(userEntry.equals("q")){
                runConversion = false;
            }else{
                float convertAmount = Float.parseFloat(userEntry);
                float result = rateAsFloat * convertAmount;
                JOptionPane.showMessageDialog(null, String.format("%.2f", result));
            }
        }
    }
}