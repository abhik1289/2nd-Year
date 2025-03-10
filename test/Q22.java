
class Employee {
    String name;
    String deptName;
    double salary;
    int uId;

    Employee(String name, String deptName, double salary, int uId) {
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        this.uId = uId;
    }

    public double earning() {
        double da = .4 * salary;
        double hra = .3 * salary;
        return salary + da + hra;
    }

    public double deduction() {
        return .12 * salary;
    }

    public double bonus() {
        return .20 * salary;
    }

    public double totalEarning() {
        return earning() - deduction() + bonus();
    }

    public void printSalarySlip() {
        System.out.println("\nSalary Slip for " + name);
        System.out.println("Department: " + deptName);
        System.out.println("Unique ID: " + uId);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Earnings: " + earning());
        System.out.println("Deductions: " + deduction());
        System.out.println("Bonus: " + bonus());
        System.out.println("Net Salary: " + totalEarning());
    }
}

class Technical extends Employee {
    Technical(String name, String deptName, double salary, int uId) {
        super(name, deptName, salary, uId);
    }

    @Override
    public void printSalarySlip() {
        super.printSalarySlip();
    }
}

class NonTechnical extends Employee {
    NonTechnical(String name, String deptName, double salary, int uId) {
        super(name, deptName, salary, uId);
    }

    @Override
    public void printSalarySlip() {
        super.printSalarySlip();
    }
}

public class Q22 {
    public static void main(String args[]) {
        Employee t = new Technical("John", "Technical", 12000.00, 12);
        t.printSalarySlip();
         t = new Technical("John", "Technical", 1206000.00, 12);
        t.printSalarySlip();
        // System.out.println(t.totalEarning());
        // System.out.println(nt.totalEarning())?;
    }
}
