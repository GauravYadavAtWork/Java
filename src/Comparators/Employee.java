package Comparators;

import java.util.ArrayList;
import java.util.Comparator;

public class Employee  {
    String name;
    public int salary;
    public int id;

    public Employee(String name, int salary, int id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }


    @Override
    public String toString() {
        return "{"+name + ", "+ salary + "}";
    }

    static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary - o2.salary;
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> lst = new ArrayList<>();
        lst.add(new Employee("Gaurav", 72, 99));
        lst.add(new Employee("Sakshee", 144, 100));
        lst.add(new Employee("Ishaan", 82, 95));
        lst.add(new Employee("Harshit", 77, 93));
        lst.add(new Employee("Kushagra", 95, 91));
        lst.sort(new Employee.SalaryComparator());
        System.out.println(lst);
    }
}
