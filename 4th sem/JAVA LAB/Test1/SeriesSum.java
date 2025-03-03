import java.util.Scanner;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        double sum = 0.0;

        // Loop to calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (i * i);
        }

        // Displaying the result
        System.out.println("Sum of the series: " + sum);
        
        scanner.close();
    }
}
