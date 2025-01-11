import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int leftSum = 0;
        int rightSum = 0;
        
        
        for (int i = 0; i < 3; ++i) {
            leftSum += arr[i][i];        
            rightSum += arr[i][2 - i];  
        }
        
        
        System.out.println("Left Diagonal Sum: " + leftSum);
        System.out.println("Right Diagonal Sum: " + rightSum);
    }
}
