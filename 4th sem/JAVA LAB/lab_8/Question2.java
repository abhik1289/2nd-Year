class SharedResource {
    public synchronized void display(String msg) {
        System.out.print("[ " + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }
        System.out.println(" ]");
    }
}

class MyThread implements Runnable {
    private String message;
    private SharedResource resource;

    public MyThread(SharedResource resource, String message) {
        this.resource = resource;
        this.message = message;
    }

    @Override
    public void run() {
        resource.display(message);
    }
}

public class Question2 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

    
        Thread thread1 = new Thread(new MyThread(resource, "Thread 1"));
        Thread thread2 = new Thread(new MyThread(resource, "Thread 2"));


        thread1.start();
        thread2.start();
    }
}
