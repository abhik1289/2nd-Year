

// abstract class C  {
//  double area(){};
    
// }

// public class Test {

//     Test(int a, int b) {
//         System.out.println("a= " + a + " b= " + b);
//     }

//     Test(int a, float b) {
//         System.out.println("a= " + a + " b= " + b);
//     }

  

//     public static void main(String[] args) {
//         byte a = 10;
//         byte b = 15;
//         Test test = new Test(); // Now it will call the no-argument constructor
//     }
// }

// Abstract class with an abstract method
abstract class Figure {
    abstract void area();
}

// Triangle class derived from Figure
class Triangle extends Figure {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

// Rectangle class derived from Figure
class Rectangle extends Figure {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        Figure fig; // Reference of superclass
        
        fig = new Triangle(5, 10); // Dynamic method dispatch
        fig.area(); // Calls Triangle's area() method

        fig = new Rectangle(4, 6); // Dynamic method dispatch
        fig.area(); // Calls Rectangle's area() method
    }
}
