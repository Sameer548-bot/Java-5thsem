
class Book {
    String title, author;
    double price;

    // No-argument constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James", 450);
        Book b3 = new Book(b2);

        System.out.println("No-argument Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        // Modify the copied object
        b3.title = "Advanced Java";

        System.out.println("After modifying copied object:");
        b3.display();

        System.out.println("Original object:");
        b2.display();
    }
}

