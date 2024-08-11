package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance(5);
        Singleton s2 = Singleton.getInstance(7);
        Singleton s3 = Singleton.getInstance(9);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
