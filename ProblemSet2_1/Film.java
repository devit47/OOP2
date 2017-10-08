package ProblemSet2_1;

import java.util.ArrayList;

public class Film{
    private String title, director;
    private int duration;

    private static int numberCreated = 0;

    public Film(){
        numberCreated++;
    }

    public Film(String title, String director, int duration){
        this.title = title;
        this.director = director;
        this.duration = duration;
        numberCreated++;
    }

    public static String displayFilms(ArrayList catalog){
        String output = "Number of films: " + getNumberCreated() + "\n\n";

        for(int i = 0; i < catalog.size(); i++){
            output += catalog.get(i).toString();
        }

        return output;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static int getNumberCreated(){
        return numberCreated;
    }

    public String toString(){
        return "Title: " + getTitle() + "\nDirector: " + getDirector()
                + "\nDuration: " + getDuration() + "\n\n";
    }
}