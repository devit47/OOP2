package ProblemSet2_1;

import javax.swing.*;
import java.util.ArrayList;

public class MyFlicks{
    public static void main(String[] args){
        ArrayList<Film> catalog = new ArrayList<Film>();

        boolean isTrue = true;

        while(isTrue == true){
            String title = JOptionPane.showInputDialog("Enter film name:");
            String director = JOptionPane.showInputDialog("Enter director:");
            String duration = JOptionPane.showInputDialog("Enter duration:");
            int durationAsInt = Integer.parseInt(duration);

            catalog.add(Film.getNumberCreated(), new Film (title, director, durationAsInt));

            String decision = JOptionPane.showInputDialog("Enter another film?");
            decision.toLowerCase();
            if(decision.equals("no")){
                isTrue = false;
            }
        }
        JOptionPane.showMessageDialog(null, Film.displayFilms(catalog));
    }
}