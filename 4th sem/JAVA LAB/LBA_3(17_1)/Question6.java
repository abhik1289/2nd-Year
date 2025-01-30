import java.util.Scanner;


// Class with constructor overloading
class Rectangle {
    private double length, breadth;

    // Default constructor (initializes to 0)
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    // Parameterized constructor (initializes with user input)
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double area() {
        return length * breadth;
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Area: " + area());
    }
}
public class Question6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using default constructor
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle using Default Constructor:");
        rect1.display();

        // Taking user input for parameterized constructor
        System.out.print("\nEnter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Using parameterized constructor
        Rectangle rect2 = new Rectangle(length, breadth);
        System.out.println("\nRectangle using Parameterized Constructor:");
        rect2.display();

        scanner.close();
    }
}
