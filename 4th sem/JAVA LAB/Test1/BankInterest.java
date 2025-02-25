import java.util.Scanner;

// Define the interface with interest() method
interface Calculate {
    double interest(double principal, int years);
}

// HDFC class implementing Calculate interface
class HDFC implements Calculate {
    final double RATE = 5.5; // Interest rate for HDFC

    public double interest(double principal, int years) {
        return (principal * RATE * years) / 100;
    }
}

// ICICI class implementing Calculate interface
class ICICI implements Calculate {
    final double RATE = 6.0; // Interest rate for ICICI

    public double interest(double principal, int years) {
        return (principal * RATE * years) / 100;
    }
}

// Main class to test the implementation
public class BankInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = scanner.nextInt();

        // Creating objects of HDFC and ICICI
        Calculate hdfc = new HDFC();
        Calculate icici = new ICICI();

        // Calculating and printing interest for both banks
        System.out.println("\nInterest Calculated:");
        System.out.println("HDFC Interest: " + hdfc.interest(principal, years));
        System.out.println("ICICI Interest: " + icici.interest(principal, years));

        scanner.close();
    }
}
