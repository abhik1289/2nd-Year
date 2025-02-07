import java.util.Scanner;

class HrsException extends Exception {
    HrsException() {
        super("InvalidHourException:hour is not greater than 24");
    }
}

class MinException extends Exception {
    MinException() {
        super("InvalidMinuteException:hour is not greater than 60");
    }
}

class SecException extends Exception {
    SecException() {
        super("InvalidSecondException:hour is not greater than 60");
    }
}

class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException();
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException();
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException();
        }

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.println("Correct Time->" + hours + ":" + minutes + ":" + seconds);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        try {
            Time tm = new Time(hours, minutes, seconds);
            tm.displayTime();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
