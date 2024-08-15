package Unit_4_collections;

import Comparators.Student;
import Comparators.StudentComparator;

import java.util.ArrayList;
import java.util.Arrays;

public class PractiseArrays {
    public static void main(String[] args) {
        Student [] arr = new Student[5];
        arr[0] = new Student("Gaurav", 72, 90);
        arr[1] = new Student("Sakshee", 144, 83);
        arr[2] = new Student("Ishaan", 82, 87);
        arr[3] = new Student("Kushagra", 95, 80);
        arr[4] = new Student("harshit", 77, 80);

        Arrays.sort(arr, new StudentComparator());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
