package multiThreading;

public class Task4_ThreadStateDemo {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Running...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("After start: " + t.isAlive());

        try {
            t.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        System.out.println("After join: " + t.isAlive());
    }
}

