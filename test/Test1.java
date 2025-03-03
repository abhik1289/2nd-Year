
// This is a simple Java program.

class Activity {
    static String college = "KIIT";

    static int hello() {
        college = "Hello";
        System.out.println(college);
        return 1;
    }
    protected void test(){
        System.out.println("Test");
    }
}
class Act2 extends Activity {

    protected void test(){
        System.out.println("Test 2");
    }
    
}

public class Test1 {
    public static void main(String args[]) {
        Act2 act2 = new Act2();
        act2.test();
        System.out.println(Activity.hello()); // Output: 1
        System.out.println("Hello World");
    }
}