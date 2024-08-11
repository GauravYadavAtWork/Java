package Comparators;

public class Student  implements Comparable<Student>{
    String name;
    int roll;
    int marks;

    public Student(String name, int roll, int marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;
    }

    @Override
    public String toString() {
        return "{"+name + ", "+ marks + "}";
    }
}
