package ProblemSet1;
/**
 * Created by Dave Griffin on 21/09/2017.
 */
public class Exercise6{
    public static void main(String[] args){
        String output = "Number\tCube\n------\t------";
        for(int i = 1; i <= 15; i++){
            output += "\n" + i + "\t\t" + MyMethods.cube(i);
        }
        System.out.println(output);
    }
}