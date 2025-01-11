import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Print the entered number (optional)
        System.out.println("You entered: " + num1);
    }
}
