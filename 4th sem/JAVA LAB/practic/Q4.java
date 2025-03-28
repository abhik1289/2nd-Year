import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String dest = sc.nextLine();
        int count = 0, v = 0, c = 0;
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);
            int i;
            while ((i = fis.read()) != -1) {
                count++;
                if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I'
                        || i == 'O' || i == 'U') {
                    v++;
                } else if (i >= 65 && i <= 90 || i >= 97 && i <= 122) {
                    c++;
                }
            }
            // fos.write((char) i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("DONE" + count + v + c);

        // System.out.println(());

    }

}
