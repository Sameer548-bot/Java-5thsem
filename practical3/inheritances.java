interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

class Machine {
    void start() {
        System.out.println("Machine started.");
    }
}

class SmartPrinter extends Machine implements Printable, Scannable {
    public void print() {
        System.out.println("SmartPrinter is printing.");
    }

    public void scan() {
        System.out.println("SmartPrinter is scanning.");
    }
}

public class Main {
    public static void main(String[] args) {

        AllInOnePrinter p1 = new AllInOnePrinter();
        p1.print();
        p1.scan();

        System.out.println();

        SmartPrinter p2 = new SmartPrinter();
        p2.start();
        p2.print();
        p2.scan();
    }
}
