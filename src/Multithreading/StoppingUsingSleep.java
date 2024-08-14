package Multithreading;

public class StoppingUsingSleep {
    public static void main(String[] args) {

        MyRunnable r1 = new MyRunnable(1);
        Thread t1 = new Thread(r1, "GauravThread");
        MyRunnable r2 = new MyRunnable(2);
        Thread t2 = new Thread(r2, "SaksheeThread");

        t1.start();
        t2.start();

        try{  // sleeps the main thread for 1000ms
            Thread.sleep(1000);
        }catch (Exception e){
            e.getMessage();
        }

        try{  // sleeps the main thread for 500ms
            Thread.sleep(500);
        }catch (Exception e){
            e.getMessage();
        }

        // Main thread work
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }
}
