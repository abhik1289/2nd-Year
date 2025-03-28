import java.io.*;

public class Question2 {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("op2.txt");
            String txt = "Hello, world";

            byte[] b = txt.getBytes();

            fos.write(b);
            // fos.write(66);

            fos.close();

            System.out.println("Question2.main()");

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}