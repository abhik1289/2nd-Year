// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class ObjectCounter {
    private static int counter=0;
    
    public ObjectCounter(){
        counter++;
    }
    
    public int getValue(){
        return counter;
    }
}

class Main {
    public static void main(String[] args) {
        
        
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        
        System.out.println(obj2.getValue());
        
        
    }
}
