
// This is a simple Java program.

interface Behaviar {
    public void h1();

    public void h2();
}
// abstract Hello{
    // public void h1();
    // public void h2();
// }
class Activity implements Behaviar {
    static String college = "KIIT";

    public void h1() {
        System.err.println("H1");
    }

    public void h2() {
    }

    static int hello() {
        college = "Hello";
        System.out.println(college);
        return 1;
    }

    protected void test() {
        System.out.println("Test");
    }
}

class Act2 extends Activity {

    protected void test() {
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