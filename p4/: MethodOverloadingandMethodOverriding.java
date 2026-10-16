class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 30000;
    }
}

class PartTimeEmployee extends Employee {
    @Override
    double calculatePay() {
        return 15000;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        // Method overloading
        System.out.println("Sum of 2 integers: " + c.add(10, 20));
        System.out.println("Sum of 3 integers: " + c.add(10, 20, 30));
        System.out.println("Sum of decimals: " + c.add(2.5, 3.5));

        // Method overriding using base-class reference
        Employee e;

        e = new FullTimeEmployee();
        System.out.println("Full-time pay: " + e.calculatePay());

        e = new PartTimeEmployee();
        System.out.println("Part-time pay: " + e.calculatePay());
    }
}
