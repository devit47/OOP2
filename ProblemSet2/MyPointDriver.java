package ProblemSet2;

public class MyPointDriver{
    public static void main(String[] args) {
        MyPoint firstPoint = new MyPoint(0,0);

        firstPoint.moveHorizontally(5);
        firstPoint.moveVertically(6);


        System.out.println(firstPoint.toString());
    }
}
