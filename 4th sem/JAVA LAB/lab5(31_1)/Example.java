
class Example1 {
    Example1(int i) {
        System.out.println("This is Example1's method1");
    }

}

class Example2 extends Example1 {

    Example2() {
        super(10);
        System.out.println("This is Example2's method");
    }

}

public class Example {
public static void main(String[] args){
    Example2 e2 = new Example2(); 
 
}
}
