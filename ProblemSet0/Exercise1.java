package ProblemSet0;

import javax.swing.*;

/**
 * Created by Dave Griffin on 13/09/2017.
 */
public class Exercise1{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name");
        String numSnacks = JOptionPane.showInputDialog("How many snacks?");
        int convNum = Integer.parseInt(numSnacks);

        int cost = convNum * 2;

        String output = name + "\nNumber of snacks requested: " + convNum + "\nCost: " + cost;

        JOptionPane.showMessageDialog(null, output );
    }
}