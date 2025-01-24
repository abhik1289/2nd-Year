
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

    // @Override
    public double cost() {
        return volume() * 60;
    }

}

class Question1 {

    public static void main(String[] args) {
        Sheet s1 = new Sheet(12, 10);
        System.out.println("Area is: " + s1.area());
        System.out.println("Price is: " + s1.price());
        Box b1 = new Box(5, 4.2, 7);
        System.out.println("Area is: " + b1.volume());
        System.out.println("Price is: " + b1.price());
    }

}