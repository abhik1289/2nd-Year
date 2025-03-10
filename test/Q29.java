import java.util.Scanner;

public class Q29 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            int dem = sc.nextInt();
            if (dem == 0) {
                throw new Exception("Invalid");
            }
            double ans = 100 / dem;
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
