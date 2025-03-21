import java.io.*;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting student details
        System.out.println("Enter student details:");
        System.out.print("Roll No: ");
        String rollNo = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Subject: ");
        String subject = scanner.nextLine();

        System.out.print("Marks: ");
        String marks = scanner.nextLine();

        // File handling
        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        try (FileWriter writer = new FileWriter(fileName, true)) {  
            writer.write("Roll No: " + rollNo + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Subject: " + subject + "\n");
            writer.write("Marks: " + marks + "\n");
            writer.write("-------------------------\n");
            System.out.println("\nStudent details saved successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

      
        System.out.println("\nReading content from the file...");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

    }
}
