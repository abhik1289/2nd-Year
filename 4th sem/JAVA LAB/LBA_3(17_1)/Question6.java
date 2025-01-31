import java.util.Scanner;



class Rectangle {
    private double length, breadth;

    
    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

   
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

  
    public double area() {
        return length * breadth;
    }

    
    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Area: " + area());
    }
}
public class Question6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Rectangle rect1 = new Rectangle();
        System.out.println("Rectangle using Default Constructor:");
        rect1.display();

     
        System.out.print("\nEnter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

      
        Rectangle rect2 = new Rectangle(length, breadth);
        System.out.println("\nRectangle using Parameterized Constructor:");
        rect2.display();

        scanner.close();
    }
}
