
class CheckArgument extends Exception {
    CheckArgument() {
        super("Exception occurred - CheckArgument");
    }
}

public class Question5 {
    public static void mian(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument();
            }
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }

            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
