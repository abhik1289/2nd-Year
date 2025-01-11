// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class q1 {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

     

    
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Display the largest number
        System.out.println("The largest number is: " + largest);
        
    }
}


