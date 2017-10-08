package ProblemSet0;

import javax.swing.*;
/**
 * Created by Dave Griffin on 14/09/2017.
 */
public class Exercise4{
    public static void main(String[] args){
        float total = 0;
        int numEntries = 0;

        String userInput = JOptionPane.showInputDialog("Enter a positive number, negative number or zero\nq to quit");
        while(!userInput.equals("q")){
            float conversion = Float.parseFloat(userInput);
            total += conversion;
            numEntries++;
            userInput = JOptionPane.showInputDialog("Enter a positive number, negative number or zero\nq to quit");
        }

        JOptionPane.showMessageDialog(null, total + "\n" + numEntries);
    }
}