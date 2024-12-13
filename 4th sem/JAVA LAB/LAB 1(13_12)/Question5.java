
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Your Last name: ");

        String lastName = scanner.nextLine();

        System.err.println(lastName + " " + firstName);

    }
}
