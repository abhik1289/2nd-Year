import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        Student[] students = new Student[n];

        // Input student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int roll = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            students[i] = new Student(roll, name, cgpa);
        }

        // Display all student details
        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        // Find student with the lowest CGPA
        Student lowestCgpaStudent = students[0];
        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCgpaStudent.cgpa) {
                lowestCgpaStudent = students[i];
            }
        }

        // Display the student with the lowest CGPA
        System.out.println("\nStudent with the lowest CGPA:");
        lowestCgpaStudent.display();

        scanner.close();
    }
}
