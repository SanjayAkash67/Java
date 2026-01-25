public class BookEncap{
    private String title;
    private String author;
    private double price; 
    // Getter and Setter for title
    public String getTitle() {
        return title;
    }          
    public void setTitle(String title) {
        this.title = title;
    }   
    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    // Getter and Setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {
        BookEncap book = new BookEncap();
        book.setTitle("Effective Java");
        book.setAuthor("Joshua Bloch");
        book.setPrice(45.99);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
    }
    
}