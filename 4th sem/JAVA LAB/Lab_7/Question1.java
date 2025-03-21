import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        // System.out.println("After changing the CASE "+str.toUpperCase());
        // System.out.println(str.concat("Patra"));
        System.out.println("Enter the character to be searched: ");
        char c = sc.next().charAt(0);
        if (str.indexOf(c) != -1) {
            System.out.println("Index is: " + str.indexOf(c));
        } else {
            System.out.println("Not found");
        }
    }
}