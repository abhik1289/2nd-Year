package mypackage.General;

public class Employee {

    protected int empId;
    String ename;

    protected double basic;

    protected Employee(int empId, String ename, double basic) {
        this.empId = empId;
        this.ename = ename;
        this.basic = basic;
    }

    public void details() {
        System.out.println("Employee ID and Empployee Name " + empId + " " + ename);

    }

    public double earnings() {
        return basic + (.8 * basic) + (.15 * basic);
    }
}
