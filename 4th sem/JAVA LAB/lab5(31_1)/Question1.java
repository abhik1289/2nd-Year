import java.util.Scanner;
abstract class Student {
    public void getinput(int roll_no, int reg_no) {
        this.reg_no = reg_no;
        this.roll_no = roll_no;
    };

    abstract void course();

    int roll_no;
    int reg_no;
}

class kittian extends Student {
    public void course() {
        System.out.println("B.Tech. (Computer Science &amp; Engg)");
    }

    public void display(){
        System.out.println("Roll No: " + roll_no);
        System.out.println("Reg No: " + reg_no);
        course();
    }
}


public class Question1 {

    public static void main(String[] args){
        kittian student = new kittian();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll No:");
        int roll_no = scanner.nextInt();
        System.out.println("Enter Reg No:");
        int reg_no = scanner.nextInt();


        student.getinput(roll_no, reg_no);
        student.display();
    }
}