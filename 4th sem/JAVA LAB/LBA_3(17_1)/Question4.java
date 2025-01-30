
class Calculator {

    // Subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Subtract three integers
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }


    
}

public class Question4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using different overloaded methods
        System.out.println("Subtracting two integers: " + calc.subtract(10, 5));
        System.out.println("Subtracting three integers: " + calc.subtract(20, 5, 3));
       

        int[] values = { 2, 3, 4 };
        System.out.println("Subtracting an array from a base value: " + calc.subtract(20, values));
    }
}
