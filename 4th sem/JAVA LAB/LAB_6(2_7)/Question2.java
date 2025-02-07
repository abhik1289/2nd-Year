import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try {
            double ans = number / 0;
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        } finally {
            System.out.println(".....Rest excuted......");
        }
    }

}
