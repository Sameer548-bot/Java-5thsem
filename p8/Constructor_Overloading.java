
class Product {
    String name;
    double price;
    int quantity;

    // No-argument constructor
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    // Constructor with product name
    Product(String name) {
        this.name = name;
        price = 0;
        quantity = 0;
    }

    // Constructor with name and price
    Product(String name, double price) {
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    // Constructor with all fields
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mouse", 500);
        Product p4 = new Product("Keyboard", 1000, 2);

        System.out.println("No-argument constructor:");
        p1.display();

        System.out.println("Name-only constructor:");
        p2.display();

        System.out.println("Name and price constructor:");
        p3.display();

        System.out.println("All-fields constructor:");
        p4.display();
    }
}

