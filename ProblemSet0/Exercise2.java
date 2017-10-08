package ProblemSet0;

import javax.swing.*;
/**
 * Created by Dave Griffin on 13/09/2017.
 */
public class Exercise2{
    public static void main(String[] args){
        String firstName = JOptionPane.showInputDialog("Enter first name");
        String initial = JOptionPane.showInputDialog("Enter initial");
        String lastName = JOptionPane.showInputDialog("Enter last name");
        String distance = JOptionPane.showInputDialog("Enter distance cycled");

        int distConv = Integer.parseInt(distance);
        float moneyEarned = 0.0f;
        if(distConv <= 10){
            moneyEarned = distConv * 0.07f;
        }else{
            moneyEarned = (10 * 0.07f) + ((distConv - 10 ) * 0.10f);
        }

        JOptionPane.showMessageDialog(null, firstName + "\n" + initial + "\n" + lastName + "\n" +
                distConv + "\n€" + moneyEarned);
    }
}