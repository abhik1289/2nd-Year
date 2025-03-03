class A {
    static {
        System.out.println("A");
    }
    A() {
        System.out.println("B");
    }
}

class B extends A {
    static {
        System.out.println("C");
    }
    B() {
        System.out.println("D");
    }
}

class Q12 {
    public static void main(String[] args) {
        B b = new B();
    }
}
