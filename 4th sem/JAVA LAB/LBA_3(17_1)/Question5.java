
import java.util.Scanner;

// Class containing overloaded area methods
class Shape {

    
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

   
    public double area(double base, double height) {
        return 0.5 * base * height;
    }

  
    public int area(int side) {
        return side * side;
    }
}

 class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();
        
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        
        System.out.print("Enter Base: ");
        double base = sc.nextDouble();
        
        System.out.print("Enter Height: ");
        double height = sc.nextDouble();
        
        System.out.print("Enter Side of Square: ");
        int side = sc.nextInt();
        
        System.out.println("The area of the Circle is: " + shape.area(radius));
        System.out.println("The area of the Triangle is: " + shape.area(base, height));
        System.out.println("The area of the Square is: " + shape.area(side));


    }
}
