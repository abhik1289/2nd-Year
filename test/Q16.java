public class Q16 {

    public static void main(String[] args) {

        int[] A = new int[5];
        int[] B = new int[5];

        if (args.length == 0) {
            return;
        }

        for (int i = 0; i < 5; i++) {
            A[i] = Integer.parseInt(args[i]);
            B[i] = A[i] * A[i];
        }

    }

}
