package multiThreading;

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

public class Task3_JoinExample {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        try {
            t1.join(); // Main waits for t1 to finish
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Main thread done.");
    }
}

