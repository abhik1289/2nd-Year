import java.util.Scanner;

import mypackage.Marketing.Sales;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee id and employee name: ");
        int empId = scanner.nextInt();
        String eName = scanner.next();
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        Sales s1 = new Sales(empId,eName,basicSalary);
        s1.details();
        System.out.println("The total earning is "+ s1.tallowance());
       
    }
}
