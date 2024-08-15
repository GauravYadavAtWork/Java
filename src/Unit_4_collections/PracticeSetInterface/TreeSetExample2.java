package Unit_4_collections.PracticeSetInterface;

import Comparators.Student;
import Comparators.StudentComparator;

import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> lst = new TreeSet<>(new StudentComparator());
        lst.add(new Student("Gaurav", 72, 90));
        lst.add(new Student("Sakshee", 144, 83));
        lst.add(new Student("Ishaan", 82, 87));
        lst.add(new Student("Harshit", 77, 81));
        lst.add(new Student("Kushagra", 95, 80));

        System.out.println(lst);
    }
}
