import java.util.Scanner;

public class Question {

    public static void main(String[] args) {

        int n = 5;
        Scanner sc = new Scanner(System.in);
        int[] num = new int[n];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; ++i) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n; ++i) {
            int number = num[i];

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Event" + even);
        System.out.println("ODD" + odd);

    }

}
