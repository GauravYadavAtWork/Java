package Unit_3_JavaFeatures;


import Comparators.Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class MyComparator  implements Comparator<Employee> {
    public int compare(Employee s1, Employee s2){
        return s1.salary - s2.salary;
    }

    public static void main(String[] args) {
        ArrayList<Employee> lst = new ArrayList<>();
        lst.add(new Employee("Gaurav", 72, 99));
        lst.add(new Employee("Sakshee", 144, 100));
        lst.add(new Employee("Ishaan", 82, 95));
        lst.add(new Employee("Harshit", 77, 93));
        lst.add(new Employee("Kushagra", 95, 91));
        lst.sort(new MyComparator());
        System.out.println(lst);
    }
}
