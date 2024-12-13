
public class Question4 {

    public static void main(String[] args) {
        int number = 505;
        int newNO = 0;
        while (number != 0) {
            int rem = number % 10;
            newNO = newNO * 10 + rem;
            number = number / 10;
        }
        System.out.println(newNO);
        if (number==newNO) {
            System.err.println("This is Palindrome");
        } else {
            System.err.println("This is not palindrome");
        }
    }

}
