package Multithreading;

public class MyRunnable implements Runnable{
    int ThreadId;
    public MyRunnable(int id){
        ThreadId = id;
    }
    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Thread process "+ThreadId);
        }
    }
}
