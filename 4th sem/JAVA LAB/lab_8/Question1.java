import java.util.Scanner;

class CounterThread extends Thread {
    private int lowerRange, upperRange;

    public CounterThread(String name, int lowerRange, int upperRange) {
        super(name);
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + getName());
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("\n" + getName() + " Finished.");
    }

}

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the thread: ");
        String name = scanner.nextLine();
        System.out.print("Enter the lower range of counter: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper range of counter: ");
        int upper = scanner.nextInt();
        Thread thread = new CounterThread(name, lower, upper);
        thread.run();
    }
}