package Multithreading;

public class SyncUsingJoin {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable(1);
        Thread t1 = new Thread(r1, "GauravThread");
        MyRunnable r2 = new MyRunnable(2);
        Thread t2 = new Thread(r2, "SaksheeThread");

        t1.setPriority(9);
        t2.setPriority(10);

        // Start thread t2 first
        t2.start();
        try {
            // Ensure t2 completes before starting t1
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start thread t1
        t1.start();

        // Main thread work
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }

        try {
            // Ensure t1 completes before the main thread continues
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
