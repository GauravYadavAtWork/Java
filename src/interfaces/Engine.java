package interfaces;

public interface Engine {
    int cost = 100;  // it is by default static and final

    public abstract void start();
    public abstract void acc();
    public abstract void stop();

    public  static  void engineDetails(){
        System.out.println("This is a engine details");
    }
}
