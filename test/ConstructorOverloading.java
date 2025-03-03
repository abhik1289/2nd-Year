// Illustrate the concept of constructor overloading in Java with two arguments and three arguments where the arguments are taken from the user - one from the command line and the others (two) using the Scanner class.

import java.util.Scanner;

public class ConstructorOverloading {
    int num1;
    int num2;
    int num3;

    // Constructor with two arguments
    public ConstructorOverloading(int a, int b) {
        this.num1 = a;
        this.num2 = b;
        System.out.println("Constructor with two arguments called.");
        System.out.println("Num1: " + num1 + ", Num2: " + num2);
    }

    // Constructor with three arguments
    public ConstructorOverloading(int a, int b, int c) {
        this.num1 = a;
        this.num2 = b;
        this.num3 = c;
        System.out.println("Constructor with three arguments called.");
        System.out.println("Num1: " + num1 + ", Num2: " + num2 + ", Num3: " + num3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get one argument from the command line
        if (args.length == 0) {
            System.out.println("Please provide one integer argument via the command line.");
            return;
        }
        int commandLineArg = Integer.parseInt(args[0]);

        // Get two arguments from the user using Scanner
        System.out.print("Enter the second integer: ");
        int scannerArg1 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int scannerArg2 = scanner.nextInt();

        // Create objects using different constructors
        ConstructorOverloading obj1 = new ConstructorOverloading(commandLineArg, scannerArg1);
        ConstructorOverloading obj2 = new ConstructorOverloading(commandLineArg, scannerArg1, scannerArg2);

        scanner.close();
    }
}