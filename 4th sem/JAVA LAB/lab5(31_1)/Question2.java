
interface Motor {
    void run();

    void consume();

    int capacity = 10;
}

class WashingMachine implements Motor {

    public void consume() {
        System.out.println("Washing machine is consuming");

    }

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void displayCapacity() {
        System.out.println("Capacity of the motor is: " + capacity);
    }

}

public class Question2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.displayCapacity();
    }
}
