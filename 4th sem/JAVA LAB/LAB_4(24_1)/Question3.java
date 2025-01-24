import java.util.Scanner;

class Apple {

    public void show() {
        System.out.println("This is the Apple show method");
    }

}

class Banana extends Apple {
    @Override
    public void show() {
        System.out.println("This is the Banana show method");
    }

}

class Cherry extends Apple {
    @Override
    public void show() {
        System.out.println("This is the Cherry show method");
    }

}

public class Question3 {

    public static void main(String[] args) {

        Apple a1 = new Apple();
        Banana b1 = new Banana();
        Cherry c1 = new Cherry();

        a1.show();
        b1.show();
        c1.show();

    }

}
