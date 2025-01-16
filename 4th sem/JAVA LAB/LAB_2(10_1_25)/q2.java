// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
        
         int evenCount = 0, oddCount = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);

      
        
        
        
    }
}