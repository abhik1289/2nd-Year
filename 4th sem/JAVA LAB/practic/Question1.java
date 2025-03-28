
import java.io.*;

public class Question1 {
    public static void main(String[] args) {
        FileReader read = null;
        FileWriter writer = null;
        try {
            read = new FileReader("ip.txt");
            writer = new FileWriter("op.txt");
            int c;
            while ((c = read.read()) != -1) {
                writer.write(c);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (read != null) {
                    read.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());

            }
        }

        System.out.println("File copied successfully.");

    }
}