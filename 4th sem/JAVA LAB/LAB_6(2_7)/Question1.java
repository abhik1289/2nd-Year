import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        int[] arr = new int[4];

        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}