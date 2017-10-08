package ProblemSet1;

import javax.swing.*;
/**
 * Created by Dave Griffin on 20/09/2017.
 */
public class Exercise4{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your full name (inc. middle name if applicable)");

        int length = name.length();
        char initial = name.charAt(0);
        String nameInCaps = name.toUpperCase();
        String lastName = name.substring(name.lastIndexOf(" "));

        String output = "Name: " + name + "\nNumber of characters in name: " + length +
                "\nInitial of first name: " + initial + "\nName in all capitals: " + nameInCaps +
                "\nSurname: " + lastName;

        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
    }
}
