import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Question3 {

    public int ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("number should be positive");
        } else {
            return number * 2;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        Question3 obj = new Question3();
        try {
            System.out.println(obj.ProcessInput(number));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
