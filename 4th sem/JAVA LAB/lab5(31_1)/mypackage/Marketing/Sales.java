package mypackage.Marketing;

import mypackage.General.Employee;

public class Sales extends Employee {
    public Sales(int empId, String ename, double basic) {
        super(empId, ename, basic);
    }

    public double tallowance() {
        return super.earnings() + super.earnings() * .05;
    }
}
