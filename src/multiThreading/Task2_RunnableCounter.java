package multiThreading;
class Task2_RunnableCounter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
    	Task2_RunnableCounter counter = new Task2_RunnableCounter();
        Thread thread = new Thread(counter);  // Pass Runnable to Thread
        thread.start();  // Start the thread
    }
}

