class A {
    int a = 90;
}

public class B extends A {
    int a = 150; // Variable hiding

    public static void main(String args[]) {
        A obj = new B(); // Upcasting (Reference of A, Object of B)
        System.out.println(obj.a);
    }
}
