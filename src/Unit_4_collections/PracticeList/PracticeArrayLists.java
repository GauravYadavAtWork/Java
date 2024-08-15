package Unit_4_collections.PracticeList;

import Comparators.Student;
import Comparators.StudentComparator;

import java.util.ArrayList;

public class PracticeArrayLists {
    public static void main(String[] args) {
        ArrayList<Student> lst = new ArrayList<>();
        lst.add(new Student("Gaurav", 72, 90));
        lst.add(new Student("Sakshee", 144, 83));
        lst.add(new Student("Ishaan", 82, 87));
        lst.add(new Student("Harshit", 77, 81));
        lst.add(new Student("Kushagra", 95, 80));
//        lst.sort(Student::compareTo);
//        lst.sort(new StudentComparator());

        lst.add(1, new Student("hehe", 50, 85));
        System.out.println(lst);
        lst.remove(1);
        System.out.println(lst);
        System.out.println("Item at index 1 " + lst.get(1));
    }
}
