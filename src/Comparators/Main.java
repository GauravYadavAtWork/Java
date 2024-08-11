package Comparators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Student[] list = new Student[5];
//        list[0] = new Student("Gaurav", 72, 99);
//        list[1] = new Student("Sakshee", 144, 100);
//        list[2] = new Student("Ishaan", 82, 95);
//        list[3] = new Student("Harshit", 77, 93);
//        list[4] = new Student("Kushagra", 95, 91);
//
//        Arrays.sort(list);
//        System.out.println(Arrays.toString(list));

        ArrayList<Student> lst = new ArrayList<>();
        lst.add(new Student("Gaurav", 72, 99));
        lst.add(new Student("Sakshee", 144, 100));
        lst.add(new Student("Ishaan", 82, 95));
        lst.add(new Student("Harshit", 77, 93));
        lst.add(new Student("Kushagra", 95, 91));
        lst.sort(Student::compareTo);
        System.out.println(lst);
    }
}
