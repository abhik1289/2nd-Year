
class Calculator {

   
    public int subtract(int a, int b) {
        return a - b;
    }

   
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }


    
}

public class Question4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Subtracting two integers: " + calc.subtract(10, 5));
        System.out.println("Subtracting three integers: " + calc.subtract(20, 5, 3));
       

    }
}
