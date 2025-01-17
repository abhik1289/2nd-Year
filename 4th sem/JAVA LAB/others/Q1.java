public class Q1 {
    public static void main(String[] args) {
        int num = 119;

        if (isPal(num)) {
            System.out.println("Y");
        } else {
            System.out.println("N");

        }

    }

    public static boolean isPal(int num) {
        int orginalNo = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev == orginalNo;
    }
}
