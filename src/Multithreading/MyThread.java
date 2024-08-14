package Multithreading;

public class MyThread extends Thread{
    int ThreadId ;

    public MyThread(int id){
        ThreadId = id;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("Thread process "+ThreadId);
        }
    }
}
