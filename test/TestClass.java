public class TestClass {
    TestClass get() {
        return this; 
    }

    public static void main(String args[]) {
        TestClass a = new TestClass();
        TestClass b = a.get();
        System.out.println(a.equals(b)); // Output: true
    }
}