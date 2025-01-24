
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

        Plate p1 = new Plate(3, 3);
        System.out.println("Dimension of plate: " + p1.dimension());
        Box b1 = new Box(3, 3, 2);
        System.out.println("Dimension of box: " + b1.dimension());
        Plate wb1 = new WoodBox(3, 3, 2, 4);
        System.out.println("Dimension of WoodBox: " + wb1.dimension());

    }

}
