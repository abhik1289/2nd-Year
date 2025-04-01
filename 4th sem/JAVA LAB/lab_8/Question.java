import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

class Question {

    public static void main(String args[]) {

        int c;

        try {
            FileReader fl1 = new FileReader("lab1.txt");
            FileReader fl2 = new FileReader("lab2.txt");

            FileWriter fw = new FileWriter("output.txt");
            while ((c = fl1.read()) == -1) {

                fw.write((char) c);

            }
            int d;

            while ((d = fl2.read()) == -1) {
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // fl1.close();
        // fl2.close();
        // fw.close();

    }

}