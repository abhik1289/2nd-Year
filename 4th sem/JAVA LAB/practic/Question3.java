import java.io.FileInputStream;

public class Question3 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ip2.txt");

            int i;
            while ((i = fis.read()) != -1)
                System.out.println((char) i);
            fis.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
