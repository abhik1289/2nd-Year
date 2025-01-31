import java.util.Scanner;

interface Emploee {

    void getDetails();

}

interface Manager {
    void getDeptDetails();
}

class Head implements Emploee, Manager {

    private int empId;
    private String empName;
    private String deptName;
    private int deptId;
    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.println("Enter Employee ID: ");
        empId = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        empName = sc.next();
    }

    public void getDeptDetails() {
        System.out.println("Enter Department ID: ");
        deptId = sc.nextInt();
        System.out.println("Enter Department Name: ");
        deptName = sc.next();
    }

    public void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Department ID: " + deptId);
        System.out.println("Department Name: " + deptName);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.display();

    }
}
