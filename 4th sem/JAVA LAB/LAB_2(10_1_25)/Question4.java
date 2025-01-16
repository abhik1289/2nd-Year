
class ObjectCounter {

    private static int c = 0;

    public  ObjectCounter() {
        c++;
    }

    public int getCounter() {
        return c;
    }

}

public class Question4 {
    public static void main(String args[]) {

        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();

        System.out.println(obj2.getCounter());

    }
}
