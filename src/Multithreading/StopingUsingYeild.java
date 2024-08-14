package Multithreading;

public class StopingUsingYeild {
    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable(1);
        Thread t1 = new Thread(r1, "GauravThread");
        MyRunnable r2 = new MyRunnable(2);
        Thread t2 = new Thread(r2, "SaksheeThread");

        t1.setPriority(9);
        t2.setPriority(10);

        // Yield method stops the execution of the current thread and runs the other thread of the same of higher priority
        // if all the remaining threads are of low priority or no waiting thread then same thread continues the execution

        t1.start();
        t2.start();

        t1.yield();

        // Main thread work
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
            Thread.yield();
        }
    }
}
