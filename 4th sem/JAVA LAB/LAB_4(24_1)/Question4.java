import java.util.Scanner;

class Account {

    int acc_no;
    double balance;

    // Account(int acc_no, double balance) {
    // this.acc_no = acc_no;
    // this.balance = balance;
    // }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account no: ");
        acc_no = sc.nextInt();
        System.out.println("Balance ammount: ");
        balance = sc.nextDouble();

    }

    public void disp() {
        System.out.println("Account No: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {

    String name;
    int aadhar_no;

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Aadhar No: ");
        aadhar_no = sc.nextInt();
    }

    @Override
    public void disp() {

        super.disp();
        System.out.println("Name : " + name);
        System.out.println("Aadhar No : " + aadhar_no);

    }
}

public class Question4 {

    public static void main(String[] args) {
        Person[] person = new Person[3];
        // System.out.println("Enter Details:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Details of " + (i + 1) + "person: ");
            person[i] = new Person();
            person[i].input();
        }
        // System.out.println("Details:");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nDetails of " + (i + 1) + "person: ");
            person[i].disp();
        }
    }

}
