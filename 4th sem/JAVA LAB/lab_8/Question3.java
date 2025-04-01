
class NegativeNoException extends Exception {
    public NegativeNoException(String msg) {
        super(msg);
    }
}

public class Question3 {
    public static void main(String args[]) {
        int no = -5;
        try {
            if (no < 0)
                throw new NegativeNoException("Neg");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
