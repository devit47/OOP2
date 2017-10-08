package ProblemSet1;

import javax.swing.*;
/**
 * Created by Dave Griffin on 20/09/2017.
 */
public class Exercise2{
    public static void main(String[] args){
        int inches = 0;
        JTextArea textArea = new JTextArea("Yards\tInches\n--------\t--------\n");
        for(int yards = 1; yards < 10; yards++){
            inches = yards * 36;
            textArea.append("" + yards + "\t" + inches + "\n");
        }
        JOptionPane.showMessageDialog(null, textArea);
        System.exit(0);
    }
}