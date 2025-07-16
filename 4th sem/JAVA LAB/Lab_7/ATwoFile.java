import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ATwoFile {

    public static void main(String[] args) {
     try{
        FileOutputStream fos = new FileOutputStream("test.txt");
        FileInputStream fis = new FileInputStream("file1.txt");
        FileInputStream fis2 = new FileInputStream("file2.txt");
        int i = 0;
        while((i=fis.read())!=-1){
            fos.write(i);
        }
        while((i=fis2.read())!=-1){
            fos.write(i);
        }
     }catch(Exception e){}
    }

}
