
class A {

    void test() {
        System.out.println("A");
    }
}

class B extends A {
    void test() {
        System.out.println("B");
    }

}

class C extends A {
    void test() {
        System.out.println("C");
    }
}

public class Test2 {
    public static void main(String[] args) {
        A a = new A();
        a.test(); // Output: B
        A b = new B();
        A ref = a;
        ref.test(); // Output: B
    }
    public static void main(){
        System.err.println("Testing");
    }
}
