
class Cal {
    int area(int width, int height) {
        return width * height;
    }

    int area(int width) {
        return width * width;
    }
}

public class Test1 {
public static void main(String[] args){
    Cal cal = new Cal();
    System.out.println(cal.area(5, 10));
    System.out.println(cal.area(10));
}
}
