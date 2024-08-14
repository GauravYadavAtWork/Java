package Exceptionhandling;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Try worked");
            int a = 5/2;
            throw new Ehandling("exception occured");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Catch worked");
        }finally {
            System.out.println("finally worked");
        }
    }
}
