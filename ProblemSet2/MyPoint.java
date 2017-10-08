package ProblemSet2;

import javax.swing.*;

public class MyPoint{
    private int xVal;
    private int yVal;

    public MyPoint(){
        this.xVal = 0;
        this.yVal = 0;
    }

    public MyPoint(int xVal, int yVal){
        setxVal(xVal);
        setyVal(yVal);
    }

    public int moveHorizontally(int xVal){
        this.xVal = getyVal() + xVal;
        return getxVal() + xVal;
    }

    public int moveVertically(int yVal){
        this.yVal = getyVal() +yVal;
        return getyVal() + yVal;
    }

    public void distanceFromOrigin(){
        String input = JOptionPane.showInputDialog("Enter number to move vertically:");
        int inputAsInt = Integer.parseInt(input);
        setyVal(moveVertically(inputAsInt));

        input = JOptionPane.showInputDialog("Enter number to move horizontally:");
        inputAsInt = Integer.parseInt(input);
        setxVal(moveHorizontally(inputAsInt));
    }


    public int getxVal(){
        return xVal;
    }
    public void setxVal(int xVal){
        this.xVal = xVal;
    }

    public int getyVal(){
        return yVal;
    }
    public void setyVal(int yVal){
        this.yVal = yVal;
    }

    public String toString(){

        return "xVal = " + getxVal() + "\tyVal = " + getyVal();
    }
}