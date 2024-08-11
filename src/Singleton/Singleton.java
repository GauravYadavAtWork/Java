package Singleton;

public class Singleton {
    int n ;
    private  static Singleton instance;

    private Singleton(int num){
        n = num;
    }

    public static Singleton getInstance(int num){
        if(instance==null){
            instance = new Singleton(num);
        }
        return instance;
    }
}
