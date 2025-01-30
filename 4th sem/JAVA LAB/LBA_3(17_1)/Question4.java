
class Calculator {

    // Subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Subtract three integers
    public int subtract(int a, int b, int c) {
        return a - b - c;
    }

    // Subtract two double values
    public double subtract(double a, double b) {
        return a - b;
    }

    // Subtract an integer from a double
    public double subtract(double a, int b) {
        return a - b;
    }

    // Subtract an integer array from a base value
    public int subtract(int base, int[] values) {
        for (int value : values) {
            base -= value;
        }
        return base;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Using different overloaded methods
        System.out.println("Subtracting two integers: " + calc.subtract(10, 5));
        System.out.println("Subtracting three integers: " + calc.subtract(20, 5, 3));
        System.out.println("Subtracting two doubles: " + calc.subtract(10.5, 2.2));
        System.out.println("Subtracting an integer from a double: " + calc.subtract(15.7, 4));

        int[] values = { 2, 3, 4 };
        System.out.println("Subtracting an array from a base value: " + calc.subtract(20, values));
    }
}
