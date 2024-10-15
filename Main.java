public class Main {
    public static void main(String[] args){
    Author author = new Author("J.K. Rowling", "jkrowling@example.com","british");
Book book = new Book("Harry Potter", author, 29.99);

System.out.println(book.toString());
    }
}