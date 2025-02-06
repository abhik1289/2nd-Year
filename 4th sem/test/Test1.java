
class Dog {
    public void test() {
            System.out.println("This is a test class.");
        }
    }
    
    class cow extends Dog {
        // @Override
        public void test() {
            System.out.println("This is a test class in cow class.");
        }
}

class Test1 {
    public static void main(String[] args) {
        Dog d = new cow();
        d.test();
    }
}