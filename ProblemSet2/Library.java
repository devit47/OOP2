package ProblemSet2;

public class Library{
    public static void main(String[] args) {
        Book bk1 = new Book();
        Book bk2 = new Book("Book 2", 5.99f, "sd345", 564);

        System.out.println(bk1.toString());
        System.out.println(bk2.toString());
    }
}