class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    void displayFuelType() {
        System.out.println("Fuel Type: " + fuelType);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, "Petrol");

        car.displayInfo();    
        car.displayFuelType();  
    }
}
