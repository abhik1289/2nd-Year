import java.util.Scanner;;
class Box {
    private double length;
    private double width;
    private double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume() {
        return length * height * width;
    }

}

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        Box b1 = new Box(length,width,height);
        System.out.println(b1.volume());

    }

}