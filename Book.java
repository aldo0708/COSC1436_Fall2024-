public class Book {
    private String title;
    private Author author;
    private double price;  // New price attribute

    // Constructor including price
    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Book Title: " + title + 
               "\n" + author.toString() +  // Displaying author's info
               "\nPrice: $" + price;       // Adding price to the display
    }
}