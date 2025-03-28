import java.util.Scanner;

class Sheet {
    double length, width;

    Sheet(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
 
    public double price() {
        return area() * 40;
    }

}

class Box extends Sheet {
    double height;

    Box(double length, double width, double height) {
        super(length, width);

        this.height = height;
    }

    public double volume() {
        return area() * height;
    }

    @Override
    public double price() {
        return volume() * 60;
    }

}

class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the Length: ");
        double length = sc.nextDouble();
        System.out.println("Enter the Height: ");
        double height = sc.nextDouble();

        Sheet s1 = new Sheet(length, width);
        System.out.println("Area is: " + s1.area());
        System.out.println("Price is: " + s1.price());
        Box b1 = new Box(length, width, height);
        System.out.println("Area is: " + b1.volume());
        System.out.println("Price is: " + b1.price());
    }

}