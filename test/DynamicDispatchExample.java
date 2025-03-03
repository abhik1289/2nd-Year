// Abstract class Figure
abstract class Figure {
    double dim1, dim2;

    // Constructor
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // Abstract method to calculate area
    abstract void area();
}

// Triangle class extending Figure
class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * dim1 * dim2));
    }
}

// Rectangle class extending Figure
class Rectangle extends Figure {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    void area() {
        System.out.println("Area of Rectangle: " + (dim1 * dim2));
    }
}

// Main class to demonstrate Dynamic Method Dispatch
public class DynamicDispatchExample {
    public static void main(String[] args) {
        Figure ref; // Reference of Figure (Parent class)

        // Dynamic Method Dispatch - Triangle
        ref = new Triangle(10, 5);
        ref.area(); // Calls Triangle's area() method

        // Dynamic Method Dispatch - Rectangle
        ref = new Rectangle(8, 4);
        ref.area(); // Calls Rectangle's area() method
    }
}
