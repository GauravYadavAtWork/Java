package Unit_3_JavaFeatures;

// A functional interface can refer to a lambda function or a class static method


interface intrf{
    int m1(int a, int b);
    static int m3(int a, int b){
        return a/b;
    }
}

interface intrf2{
    void m5();
}

class abc{
    static void m2(){
        System.out.println("hehe");
    }

    public static int m2(int i, int i1) {
        return i*i1;
    }
}

public class Lambdafunctions {
    public static void main(String[] args) {
        intrf i = (a, b) -> a + b;
        intrf j = abc::m2;
        intrf2 k = abc::m2;
        System.out.println(i.m1(5,6));
        System.out.println(j.m1(8,2));
        k.m5();
    }
}
