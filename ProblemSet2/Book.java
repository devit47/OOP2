package ProblemSet2;

public class Book{
    private String title;
    private float price;
    private String isbn;
    private int numberOfPages;

    public Book(){
        this("Unknown", 0.0f, "Unknown", 0);
    }

    public Book(String title, float price, String isbn, int numberOfPages) {
        setTitle(title);
        setPrice(price);
        setIsbn(isbn);
        setNumberOfPages(numberOfPages);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


    public String toString() {
        return String.format("Title: %-20s\nPrice: %3.2f\nISBN: %-20s\nPages: %d", title, price, isbn, numberOfPages);
    }
}