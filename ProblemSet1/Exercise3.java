package ProblemSet1;

import javax.swing.*;
import java.awt.*;
/**
 * Created by Dave Griffin on 20/09/2017.
 */
public class Exercise3{
    public static void main(String[] args){
        float COST_PER_SQR_MTR = 33.5f;

        String name = JOptionPane.showInputDialog("Please enter your name:");
        float length = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the room:"));
        float breadth = Float.parseFloat(JOptionPane.showInputDialog("Please enter the breadth of the room:"));

        float area = length * breadth;
        float totalCost = area * COST_PER_SQR_MTR;

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("monospaced", Font.PLAIN, 12));

        textArea.append("Quotation For " + name + "\n");

        textArea.append(String.format(" %-40s%.2f m.\n %-40s%.2f m.\n %-40s%.2f m.\n %-40s%.2f euro\n %-40s%.2f euro",
                "Length of room:", length,"Breadth of room:", breadth, "Total area of the room:", area,
                "Cost per square metre of carpet:", COST_PER_SQR_MTR, "total cost of carpet:", totalCost));

        JOptionPane.showMessageDialog(null, textArea);

        System.exit(0);
    }
}