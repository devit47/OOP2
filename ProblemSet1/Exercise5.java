package ProblemSet1;

import javax.swing.*;
/**
 * Created by Dave Griffin on 20/09/2017.
 */
public class Exercise5{
    public static void main(String[] args) {
        double a = 1, b = 6, c = -16, result1, result2;

        result1 = ((-b) + (Math.sqrt(((b * b) - (4 * a * c))))) / (2 * a);
        result2 = ((-b) - Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a);

        JOptionPane.showMessageDialog(null, "Possible values for x are :" + result1 +
        " & " + result2);
    }
}