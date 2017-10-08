package ProblemSet0;

import javax.swing.*;
/**
 * Created by Dave Griffin on 14/09/2017.
 */
public class Exercise6{
    public static void main(String[] args) {
        String operatorInput = JOptionPane.showInputDialog("Enter operation required:\na for addition\ns for subtractiom" +
                "\nm for multiplication\nd for division\nq to quit");
        char operatorConv = operatorInput.charAt(0);

        float result = 0;

        while(operatorConv != 'q'){
            String userEntry = JOptionPane.showInputDialog("Enter first number");
            float num1 = Float.parseFloat(userEntry);
            userEntry = JOptionPane.showInputDialog("Enter second number");
            float num2 = Float.parseFloat(userEntry);

            switch(operatorConv){
                case 'a':
                    result = num1 + num2;
                    break;
                case 's':
                    result = num1 - num2;
                    break;
                case 'd':
                    result = num1 / num2;
                    break;
                case 'm':
                    result = num1 * num2;
                    break;
                case 'q':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Operator not recognised");
                    System.exit(0);
            }
            operatorInput = JOptionPane.showInputDialog("Enter operation required:\na for addition\ns for subtractiom" +
                    "\nm for multiplication\nd for division\nq to quit");
            operatorConv = operatorInput.charAt(0);
        }
        JOptionPane.showMessageDialog(null, result);
    }
}