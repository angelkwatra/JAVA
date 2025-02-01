// File: BookDemo.java

class Book {
    private String title;
    private String author;
    private int publicationYear; // Optional attribute

    // Default constructor: sets default values
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = -1; // -1 indicates not set
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = -1; // Not set
    }

    // Constructor with title, author, and publicationYear
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (publicationYear != -1) {
            System.out.println("Publication Year: " + publicationYear);
        }
        System.out.println();
    }
}

public class l4q1 {
    public static void main(String[] args) {
        // Create Book objects using different constructors
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayDetails();

        Book customBook = new Book("1984", "George Orwell");
        System.out.println("Custom Book:");
        customBook.displayDetails();

        Book publishedBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        System.out.println("Published Book:");
        publishedBook.displayDetails();
    }
}
