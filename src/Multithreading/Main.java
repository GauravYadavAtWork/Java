package Multithreading;

public class Main {
    public static void main(String[] args) {
        MyRunnable r1 =  new MyRunnable(1);
        Thread t1 = new Thread(r1, "GauravThread");
        MyRunnable r2 =  new MyRunnable(2);
        Thread t2 = new Thread(r2, "SaksheeThread");

        t1.start();
        t1.setPriority(9);
        t2.start();
        t2.setPriority(10);
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }


    }
}
