package ProblemSet2;

import javax.swing.*;

public class MessageDriver{
    public static void main(String[] args) {
        Message jamesToGooch = new Message("Gooch", "James");
        jamesToGooch.setMessageText(JOptionPane.showInputDialog("Enter message:"));

        System.out.println(jamesToGooch.toString());

        Message message2 = new Message();
        message2.setSender("Gooch");
        message2.setRecipient("James");
        message2.setMessageText(JOptionPane.showInputDialog("Enter response:"));
        System.out.println(message2.toString());
    }
}