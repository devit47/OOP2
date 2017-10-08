package ProblemSet1;

import javax.swing.*;
/**
 * Created by Dave Griffin on 21/09/2017.
 */
public class Exercise7{
    public static void main(String[] args) {
        boolean isTrue = true;
        String output = "";

        while(isTrue == true){
            String input = JOptionPane.showInputDialog("Please enter a number (-1 to quit):");
            int inputConv = Integer.parseInt(input);

            if(inputConv == -1){
                isTrue = false;
            }else{
                if(isEven(inputConv) == true){
                    output += input + " is even\n";
                }else{
                    output += input + " is odd\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
    public static boolean isEven(int input){
        if(input % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}