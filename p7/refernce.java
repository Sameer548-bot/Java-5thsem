
class Demo {
    Demo() {
        System.out.println("Object created.");
    }

    void display() {
        System.out.println("Object is being used.");
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collector may clean up the object.");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();

        d = null; // Remove the reference

        System.out.println("Requesting garbage collection...");
        System.gc();

        System.out.println("Program continues.");
    }
}

