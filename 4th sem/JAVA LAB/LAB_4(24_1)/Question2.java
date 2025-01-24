import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double dimension() {
        return length * width;
    }
}

class Box extends Plate {

    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public double dimension() {
        return super.dimension() * height;
    }
}

class WoodBox extends Box {

    double thick;

    WoodBox(double length, double width, double height, double thick) {
        super(length, width, height);
        this.thick = thick;
    }

    @Override
    public double dimension() {
        return super.dimension() * thick;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the Length: ");
        double length = sc.nextDouble();
        System.out.println("Enter the Height: ");
        double height = sc.nextDouble();
        System.out.println("Enter the Thick: ");
        double thick = sc.nextDouble();
        Plate p1 = new Plate(length, width);
        System.out.println("Dimension of plate: " + p1.dimension());
        Box b1 = new Box(length, width, height);
        System.out.println("Dimension of box: " + b1.dimension());
        Plate wb1 = new WoodBox(length, width, height, thick);
        System.out.println("Dimension of WoodBox: " + wb1.dimension());

    }

}
