package ProblemSet2;

import javax.swing.*;

public class BicycleDriver{
    public static void main(String[] args){
        String bk1OwnerName = JOptionPane.showInputDialog("Please enter your name");
        String bk1value = JOptionPane.showInputDialog("Enter bike value");
        float bk1FloatValue = Float.parseFloat(bk1value);
        String bk1Make = JOptionPane.showInputDialog("Enter bike make");

        Bicycle bike1 = new Bicycle(bk1OwnerName, bk1FloatValue, bk1Make);

        Bicycle noArgsBike = new Bicycle();
        noArgsBike.setOwnersName(JOptionPane.showInputDialog("Please enter your name"));
        String noArgsBikeValue = JOptionPane.showInputDialog("Enter bike value");
        float noArgsBikeFloatValue = Float.parseFloat(noArgsBikeValue);
        noArgsBike.setValue(noArgsBikeFloatValue);
        noArgsBike.setMake(JOptionPane.showInputDialog("Enter bike make"));

        bike1.setValue(bike1.getValue() + 10);

        System.out.println(bike1.toString());
        System.out.println(noArgsBike.toString());

        float totalValueOfBikes = bike1.getValue() + noArgsBike.getValue();
        System.out.println("Total value of bikes: €" + totalValueOfBikes);
    }
}