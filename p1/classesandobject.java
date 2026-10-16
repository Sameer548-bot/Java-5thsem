

class Student {
    int rollNumber;
    String name;
    int mark1, mark2, mark3;

    Student(int rollNumber, String name, int mark1,
            int mark2, int mark3) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    double calculatePercentage() {
        return calculateTotal() / 3.0;
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + mark1 + ", "
                           + mark2 + ", " + mark3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.printf("Percentage: %.2f%%\n",
                          calculatePercentage());
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85, 90, 80);
        Student s2 = new Student(102, "Priya", 92, 88, 95);
        Student s3 = new Student(103, "Amit", 75, 80, 70);


        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
