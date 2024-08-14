package LambdaFunctions;

interface Operations{
    int operation(int a, int b);
}

public class Main{

    public static void main(String[] args) {
        Main m = new Main();
        Operations add = (a,b)-> a + b;
        Operations sub = (a,b) -> a - b;
        Operations mul = (a,b) -> a * b;

        System.out.println(m.operation(3,4, add));
        System.out.println(m.operation(3,4, sub));
        System.out.println(m.operation(3,4, mul));
    }

    private int operation(int a, int b, Operations op){
        return op.operation(a,b);
    }

}
