import java.util.Scanner;

interface Income {
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}

class Manager implements Income {
    public double earnings(double basic) {
        return basic + (0.8 * basic) + (0.15 * basic);
    }

    public double deductions(double basic) {
        return basic + (.12 * basic);
    }

    public double bonus(double basic) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

class SubStaff extends Manager {
    public double bonus(double basic) {
        return (0.5 * basic);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();
        Manager m1 = new Manager();
        SubStaff s1 = new SubStaff();
        System.out.println("Manager earnings: " + m1.earnings(basicSalary));
        System.out.println("Manager deductions: " + m1.deductions(basicSalary));
        System.out.println("Sub-staff bonus: " + s1.bonus(basicSalary));
        
    }
}
