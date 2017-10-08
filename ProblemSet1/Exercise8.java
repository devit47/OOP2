package ProblemSet1;

import javax.swing.*;

/**
 * Created by Dave Griffin on 21/09/2017.
 */
public class Exercise8{
    public static void main(String[] args) {
        int[] userInput = new int[10];

        for(int i = 0; i < userInput.length; i++){
            String input = JOptionPane.showInputDialog("Please enter a whole number:");
            int numConvert = Integer.parseInt(input);
            userInput[i] = numConvert;
        }

        System.out.println("The first value in the array is " + userInput[0] +
        "\nThe 5th number in the array is " + userInput[4]);
        System.exit(0);
    }
}