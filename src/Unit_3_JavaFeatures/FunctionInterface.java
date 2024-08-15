package Unit_3_JavaFeatures;

class Student2{
    int marks;
    String name;
    int roll;

    Student2(int i, String n, int m){
        marks = m;
        name = n;
        roll = i;
    }
}

interface Function<Student, Integer>{
    public Integer apply(Unit_3_JavaFeatures.Student2 s);
}

// a function interface is which accepts the single arugment and returns the boolean values


public class FunctionInterface {
    public static void main(String[] args) {
        Function p = (Student2 s) ->{
            if(s.marks>90) return s.name.length();
            else return -1;
        };

        System.out.println(p.apply(new Student2(1, "Gaurav", 99)));
    }
}
