package Unit_3_JavaFeatures;

import java.util.Comparator;

class Student implements Comparator<Student> {
    int marks;
    String name;
    int roll;

    Student(int i, String n, int m){
        marks = m;
        name = n;
        roll = i;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    }

    @Override
    public String toString() {
        return "{ " +  this.roll + ", " + this.name + ", " + this.marks + " }";
    }
}

interface Predicate<Student>{
    public boolean test(Unit_3_JavaFeatures.Student s);
}

// a predicate is function which accepts the single arugment and returns the boolean values
// Predicate interface is used

public class Predicates {
    public static void main(String[] args) {
        Predicate p = (Student s) ->{
            if(s.marks>90) return true;
            else return false;
        };

        boolean isGood = p.test(new Student(1, "Gaurav", 99));
        System.out.println(isGood);
    }
}
