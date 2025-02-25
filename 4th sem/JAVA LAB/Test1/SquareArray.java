public class SquareArray {
    public static void main(String[] args) {
        // Check if command line arguments are provided
        if (args.length == 0) {
            System.out.println("Please provide numbers as command line arguments.");
            return;
        }

        // Initialize array A with command line arguments
        int n = args.length;
        int[] A = new int[n];
        int[] B = new int[n];

        // Parse input and compute squares
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(args[i]); // Convert input to integer
            B[i] = A[i] * A[i]; // Store square in B
        }

        // Display arrays
        System.out.println("Array A (Input values):");
        for (int num : A) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray B (Squares of A):");
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}
